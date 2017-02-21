package com.example;

/**
 * Created by JayRay on 20/02/2017.
 * Info: for Bridge Pattern
 * Windows 操作系统实现类：具体实现类
 */

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在 Windows 操作系统中显示图像: ");
    }
}
