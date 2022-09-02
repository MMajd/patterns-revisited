package com.mmajd.servicelocator.locators;

import com.mmajd.servicelocator.services.ILogger;
import com.mmajd.servicelocator.services.SystemLogger;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;


@Slf4j
public final class LoggingServiceLocator {
    private static final LoggingServiceLocator INSTANCE = new LoggingServiceLocator();
    private final Map<String, ILogger> cache = new WeakHashMap<>();
    private final Map<String, Class<? extends ILogger>> context = new HashMap<>() {{
        put("SystemLogger", SystemLogger.class);
    }};


    private LoggingServiceLocator() {}

    public void registerFromAppProperties(String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        try (InputStream in = LoggingServiceLocator.class.getClassLoader().getResourceAsStream("application.yml")) {
            if (in == null) {
                System.out.println("Sorry, unable to find config.properties");
                throw new IOException();
            }

            Properties prop = new Properties();
            prop.load(in);

            String clazzName = prop.getProperty(name);

            log.info("Logger to be loaded {} ", clazzName);

            if (clazzName != null) {
                Class<? extends ILogger> clazz = (Class<? extends ILogger>) Class.forName(clazzName);

                log.info("Logger {} has been created", clazzName);

                cache.put(name, clazz.getConstructor().newInstance());
            }

            else {
                throw new ClassNotFoundException("Couldn't load required logger");
            }
        }
        catch (IOException ex) {
            throw new IOException("Make sure that you have application.yml file resources directory");
        }
    }

    public static LoggingServiceLocator getInstance() {
        return INSTANCE;
    }

    public ILogger lookup(String serviceName) throws InaccessibleObjectException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ILogger newLogger = cache.getOrDefault(serviceName, null);
        if (newLogger != null) {
            return newLogger;
        }

        if (context.containsKey(serviceName)) {
            newLogger = context.get(serviceName).getConstructor().newInstance();
            cache.put(serviceName, newLogger);
            return newLogger;
        }

        throw new InaccessibleObjectException("No service with the name: " + serviceName + " was found");
    }

}
