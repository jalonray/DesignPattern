package com.example;

/**
 * Created by JayRay on 06/02/2017.
 * Info: 普通的单例模式
 * 多线程情况下会发生实例不唯一的情况
 */

public class NormalSingleton {
    private static NormalSingleton instance = null;

    private NormalSingleton() {

    }

    /**
     * 多线程情况下，当线程 A 与线程 B 均发现 instance == null 时，同时执行 instance = new NormalSingleton,
     * 即发生线程 A 与线程 B 获取到了不同实例
     * @return
     */
    public static NormalSingleton getInstance() {
        if (instance == null) {
            instance = new NormalSingleton();
        }
        return instance;
    }

    public void displayProcesses() {

    }

    public void displayServices() {

    }

}
