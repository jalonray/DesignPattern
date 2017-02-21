package com.example;

/**
 * Created by JayRay on 07/02/2017.
 * Info: abstract actor base class for simple factory pattern
 */

public abstract class AbstractProduct {
    public void methodSame() {
        // same methods
        System.out.print("This is a Product: ");
    }

    // different method
    public abstract void methodDiff();
}
