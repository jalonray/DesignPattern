package com.example;

/**
 * Created by JayRay on 07/02/2017.
 * Info:
 */

public class StaticFactory {
    public static AbstractProduct getProduct(String arg) {
        AbstractProduct product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ProductA();
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ProductB();
        }
        return product;
    }
}
