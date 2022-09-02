package com.mmajd.servicelocator.services;

public interface ILogger {
    void info(String fmt, Object ...args);
    void warn(String fmt, Object ...args);
}
