package com.example;

/**
 * Created by JayRay on 20/02/2017.
 * Info: for Bridge Pattern
 */

public abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}
