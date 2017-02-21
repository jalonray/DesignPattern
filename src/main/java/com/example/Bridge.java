package com.example;

/**
 * Created by JayRay on 20/02/2017.
 * Info: 桥接模式(Bridge Pattern): 将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为
 * 柄体(Handle and Body)模式或接口(Interface)模式。
 * 一般包含如下几个角色：
 * Abstraction(抽象类): 用于定义抽象类的接口，它一般是抽象类而不是接口，其中定义了一个 Implementor (实现类接口) 类型
 * 的对象并可以维护该对象，它与 Implementor 之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法。
 * RefinedAbstraction (扩充抽象类): 扩充由 Abstraction 定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在
 * Abstraction 中声明的抽象业务方法，在 RefinedAbstraction 中可以调用在 Implementor 中定义的业务方法。
 * Implementor (实现类接口): 定义实现类的接口，这个接口不一定要与 Abstraction 的接口完全一致，事实上这两个接口可以完
 * 全不同，一般而言，Implementor 接口仅提供基本操作，而 Abstraction 中不仅拥有自己的方法，还可以调用到 Implementor
 * 中定义的方法，使用关联关系来替代继承关系。
 * ConcreteImplementor (具体实现类): 具体实现 Implementor 接口，在不同的 ConcreteImplementor 中提供基本操作的
 * 不同实现，在程序运行时，ConcreteImplementor 对象将替换其父类对象，提供给抽象类具体的业务操作方法。
 *
 * 优点：
 * 1.分离抽象接口及其实现部分。桥接模式使用"对象间的关联关系"解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自
 * 的维度来变化。所谓抽象和实现沿着各自维度的变化，也就是说抽象和实现不再在同一个继承层次结构中，而是"子类化"它们，使它们各自
 * 都
 */

public class Bridge {
}
