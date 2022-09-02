package com.mmajd.servicelocator.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class SystemLogger implements ILogger {
    @Override
    public void info(String fmt, Object... args) {
        System.out.format("SystemLogger INFO: " + fmt, args);
    }

    @Override
    public void warn(String fmt, Object... args) {
        System.out.format("SystemLogger WARN: " + fmt, args);
    }
}
