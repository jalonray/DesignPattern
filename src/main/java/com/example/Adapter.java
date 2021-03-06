package com.example;

/**
 * Created by JayRay on 16/02/2017.
 * Info: 适配器模式(Adapter Pattern): 将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为
 * 包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 * 根据适配器类与适配者类关系的不同，适配器模式可分为对象适配器和类适配器两种，在对象适配器模式中，适配器与适配者之间是关联
 * 关系；在类适配器模式中，适配器与适配者之间是继承（或实现）关系。在实际开发中，对象适配器的使用频率更高。
 *
 * 缺省适配器模式(Default Adapter Pattern): 当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为
 * 接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可以选择性的覆盖父类的某些方法来实现需求，它适用于不想使用一个
 * 接口中的所有方法的情况，又称为单接口适配器模式。
 *
 * 注：在适配器模式定义中所提及的接口是指广义的接口，它可表示一个方法或者方法的集合。
 *
 * 优点：
 * 无论是对象适配器模式还是类适配器模式，都有以下优点：
 * 1.将目标类和适配者解耦，通过引入一个适配器类来重用现有的适配者类，无须修改原有结构。
 * 2.增加了类的透明性和复用性，将具体的业务实现过程封装在适配者类中，对于客户端而言是透明的，而且提高了适配者的复用性，同一个
 * 适配者尖可以在从个不同的系统中复用。
 * 3.灵活性和扩展性故都非常好，通过使用配置文件，可以很方便地更换适配器，也可以在不修改原有代码的基础上增加新的适配器类，完全符合
 * "开闭原则"。
 * 4.一个对象适配器可以把多个不同的适配者适配到同一个目标
 * 5.可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，根据"里氏代换原则"，适配者的子类也可以通过该适配器进行适配。
 *
 * 缺点：
 * 类适配器：
 * 1.对于Java、C#等不支持多重类继承的语言，一次最多只能适配一个适配者类，不能同时适配多个适配者。
 * 2.适配者类不能为最终类，例如Java中不能为final类，C#中不能为sealed类。
 * 3.在Java、C#等语言中，类适配器模式中的目标抽象类只能为接口，不能为类，使其具有一定局限性。
 * 对象适配器：
 * 与类适配器模式相比，要在适配器中置换适配者类的某些方法比较麻烦。如果一定要置换掉适配者类的一个或多个方法，可以先做一个适配者
 * 的子类，将适配者类的方法置换掉，然后再把适配者类的子类当做真正的适配者进行适配，实现过程较为复杂。
 *
 * 使用场景：
 * 1.系统需要使用一些现有的类，而这些类的接口（例如方法名）不符合系统的需求，甚至没有源代码。
 * 2.想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。
 */

public class Adapter {
}
