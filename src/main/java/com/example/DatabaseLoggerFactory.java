package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info: Factory method pattern, from
 */

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
