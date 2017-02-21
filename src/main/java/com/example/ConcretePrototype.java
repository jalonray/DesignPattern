package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info:
 */

public class ConcretePrototype implements Prototype{
    private String attr;

    @Override
    public Prototype protoClone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr(this.getAttr());
        return prototype;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }
}
