package com.mmajd.servicelocator;

import com.mmajd.servicelocator.locators.LoggingServiceLocator;
import com.mmajd.servicelocator.services.ILogger;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        LoggingServiceLocator locator = LoggingServiceLocator.getInstance();
        locator.registerFromAppProperties("Log4jAdaptee");

        ILogger logger = locator.lookup("SystemLogger");
        ILogger log4j = locator.lookup("Log4jAdaptee");

        logger.warn("Stmt %s \n", "This is just a logger");
        log4j.info("Stmt {}", "This is just a logger");
        log4j.warn("Stmt {}", "This is just a logger");
    }
}