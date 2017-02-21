package com.example;

/**
 * Created by JayRay on 06/02/2017.
 * Info: 饿汉单例模式，可保证多线程情况下实例唯一
 */

public class EagerSingleton {

    /**
     * 在类加载时创建实例，可保证实例唯一性，但是在加载时即创建，会造成资源浪费
     */
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
