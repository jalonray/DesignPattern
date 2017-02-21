package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info:
 */

public class ProductA extends AbstractProduct {

    @Override
    public void methodDiff() {
        methodSame();
        System.out.println("A");
    }
}
