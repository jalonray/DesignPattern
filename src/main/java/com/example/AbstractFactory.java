package com.example;

/**
 * Created by JayRay on 15/02/2017.
 * Info: Abstract Factory Pattern
 * 抽象工厂模式，引入两个概念：
 * 1.产品等级结构：产品等级结构即产品的继承结构。
 * 2.产品族：产品族指有同一个工厂生产的，位于不同产品等级结构中的一组产品。
 * 抽象工厂模式是所有形式的工厂模式中最为抽象和具有一般性的一种形式。
 * 抽象工厂模式与工厂方法最大的区别在于，工厂方法模式针对的是一个产品等级结构，而抽象工厂模式需要面对多个产品等级结构，一个
 * 工厂等级结构可以负责多个不同产品等级结构中的产品对象创建。当一个工厂等级结构可以创建出分属于不同产品等级结构的一产品族中
 * 的所有对象时，抽象工厂模式比工厂方法模式更为简单、更有效率。
 * 定义：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式又称为 Kit 模式，它是一种对象创建
 * 型模式。
 *
 * "开闭原则"的倾斜性：
 * 在抽象工厂模式中，增加新的产品族很方便，但是增加新的产品等级结构很麻烦
 */

public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
