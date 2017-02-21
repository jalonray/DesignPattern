package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info: A abstract factory for create logger
 * Factory method pattern
 */

public interface LoggerFactory {
    public Logger createLogger();
}
