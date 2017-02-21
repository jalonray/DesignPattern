package com.example;

/**
 * Created by JayRay on 20/02/2017.
 * Info:
 */

public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        impl.operationImpl();
    }
}
