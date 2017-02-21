package com.example;

/**
 * Created by JayRay on 06/02/2017.
 * Info: 懒汉单例模式，可保证多线程情况下实例唯一性
 */

public class LazySingleton {

    /**
     * 标注 volatile 保证多线程下读写有序，否则不能保证实例单一。
     * 见：http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html (En)
     * or: http://www.infoq.com/cn/articles/double-checked-locking-with-delay-initialization (CN)
     */
    private volatile static LazySingleton instance = null;
    private LazySingleton() {

    }

    /**
     * 线程 A 与线程 B，当发现 instance == null 时，均进入同步区域进行实例创建
     * 当 A 创建完一个实例后，B 在同步区域需要判空来得知是否有别的线程创建了实例，所以需要双重判空来保证单一性
     * @return 唯一的实例
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
