package com.mmajd.servicelocator.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4jAdaptee implements ILogger {
    private final static Logger LOGGER = LogManager.getLogger(Log4jAdaptee.class.getName());
    @Override
    public void info(String fmt, Object... args) {
        LOGGER.info(fmt, args);
    }

    @Override
    public void warn(String fmt, Object... args) {
        LOGGER.warn(fmt, args);
    }
}
