package com.example;

/**
 * Created by JayRay on 06/02/2017.
 * Info: Initialization On Demand Holder 静态内部类的单例模式
 * 在加载 IoDHSingleton 类时并不会加载内部类，不会去实例化 instance 对象，在调用 getInstance() 方法时，
 * 加载内部类 HolderClass，同时也会对 instance 进行初始化，JVM 自动保证线程的安全性，这是一种结合了 LazySingleton
 * 和 EagerSingleton 两种实现方式优点的单例模式实现方式。
 */

public class IoDHSingleton {
    private IoDHSingleton() {

    }

    private static class HolderClass {
        private static final IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }
}
