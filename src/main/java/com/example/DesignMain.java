package com.example;

/**
 * 设计模式学习笔记
 * 几大原则：
 * 单一职责原则 (Single Responsibility Principle, SRP): 一个类只负责一个功能领域中的相应职责
 * 开闭原则 (Open-Closed Principle, OCP): 软件实体应对扩展开放
 * 里氏代换原则 (Liskov Substitution Principle, LSP): 所有引用基类对象的地方能够透明地使用其子类的对象
 *     严格定义：如果每一个类型为 S 的对象 o1，都有类型为 T 的对象 o2，使得以 T 定义的所有程序 P 在所有的对象 o1 代换
 *     o2 时，程序 P 的行为没有变化，那么类型 S 是类型 T 的子类型。
 * 依赖倒转原则 (Dependence Inversion Principle, DIP): 抽象不应该依赖于细节，细节应该依赖于抽象
 * 接口隔离原则 (Interface Segregation Principle, ISP): 使用多个专门的接口，而不是用单一的总接口
 *     每一个接口应该承担一种相对独立的角色，不干不该干的事，该干的事都干。这里的"借口"有两种定义：一种是指一个类型所具有的
 *     方法特征的集合，仅仅是一种逻辑上的抽象；另一种是语言的"接口"定义，例如 Java 中的 interface。对于这两种定义，ISP
 *     的表达方式以及含义均有所不同：
 *     （1）是一种逻辑上的概念，接口的划分将直接带来类型的划分。可以把接口理解为角色，一个接口只能代表一个角色，每个角色都有
 *     特定的接口，此时，这个原则可以称为"角色隔离原则"。
 *     （2）ISP 指"接口仅仅提供客户端需要的行为，客户端不需要的行为则隐藏起来，应当为客户端提供尽可能小的单独的接口，而不
 *     要提供大的总接口。
 * 合成复用原则 (Composite Reuse Principle, CRP): 尽量使用对象组合，而不是继承来达到服用目的
 * 迪米特法则 (Law of Demeter, LoD): 一个软件实体应当尽可能少地与其他实体发生相互作用
 *
 * 开闭原则是目的，里氏代换原则是基础，依赖倒转原则是手段
 */
public class DesignMain {
    public static void main(String... args) {
        // Simple Factory Pattern or Static Factory Pattern
        AbstractProduct product = StaticFactory.getProduct(XMLUtil.getChartType());
        product.methodDiff();

        // Factory Method Pattern
        System.out.println();
        LoggerFactory factory = XMLUtil.getLoggerFactory();
        if (factory != null) {
            factory.createLogger().writeLog();
        }

        // Abstract Factory Pattern
        System.out.println();
        AbstractFactory abstractFactory = new ConcerteFactory1();
        abstractFactory.createProductA();
        abstractFactory.createProductB();

        abstractFactory = new ConcreteFactory2();
        abstractFactory.createProductA();
        abstractFactory.createProductB();

        // Prototype Pattern
        System.out.println();
        ConcretePrototype prototype1 = new ConcretePrototype();
        prototype1.setAttr("Apple");
        Prototype prototype2 = prototype1.protoClone();

        // Builder pattern
        System.out.println();
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(XMLUtil.getActorBuilder());
        System.out.println(actor.toString());

        // Adapter pattern
        System.out.println();
        ScoreOperation operation = XMLUtil.getOperation();
        int[] scores = {84, 76, 50, 69, 90, 91, 88, 96};
        int result[];

        System.out.println("成绩排序结果：");
        result = operation.sort(scores);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        if (operation.search(result, 90) != -1) {
            System.out.println("找到成绩90！");
        } else {
            System.out.println("未找到成绩90！");
        }

        System.out.println("查找成绩92：");
        if (operation.search(result, 92) != -1) {
            System.out.println("找到成绩92！");
        } else {
            System.out.println("未找到成绩92！");
        }

        // Bridge pattern
        System.out.println();
        Image image = (Image) XMLUtil.getConfigClass("imageType", Image.class);
        ImageImp imp = (ImageImp) XMLUtil.getConfigClass("systemOperation", ImageImp.class);
        if (image != null && imp != null) {
            image.setImageImg(imp);
            image.parseFile("Photo");
        }
    }
}
