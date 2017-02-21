package com.example;

/**
 * Created by JayRay on 20/02/2017.
 * Info: for Bridge Pattern
 * 抽象图像类：抽象类
 */

public abstract class Image {
    protected ImageImp imp;
    public void setImageImg(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
