package com.example;

/**
 * Created by JayRay on 16/02/2017.
 * Info: 建造者模式(Builder Pattern): 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者
 * 模式是一种对象创建型模式。
 */

public abstract class ActorBuilder {

    protected Actor actor = new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public Actor getResult() {
        return actor;
    }
}
