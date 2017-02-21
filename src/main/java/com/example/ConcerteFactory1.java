package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info:
 */

public class ConcerteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
