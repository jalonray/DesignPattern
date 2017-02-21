package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info:
 */

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
