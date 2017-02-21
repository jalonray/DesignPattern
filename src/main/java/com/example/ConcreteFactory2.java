package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info:
 */

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
