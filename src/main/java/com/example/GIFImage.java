package com.example;

/**
 * Created by JayRay on 20/02/2017.
 * Info: for Bridge Pattern
 * GIF 格式图像：扩充抽象类
 */

public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        imp.doPaint(new Matrix());
        System.out.println(fileName + ", 格式为 BMP");
    }
}
