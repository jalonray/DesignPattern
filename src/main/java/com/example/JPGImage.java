package com.example;

/**
 * Created by JayRay on 20/02/2017.
 * Info: for Bridge Pattern
 * JPG 格式图像：扩充抽象类
 */

public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ", 格式为 JPG。");
    }
}
