package com.example;

/**
 * Created by JayRay on 16/02/2017.
 * Info: The controller for Builder Pattern.
 * Which can create products with specific builder.
 *
 * 可以将此类合并定义在 Builder 中：
 * abstract class Builder {
 *     public Actor construct() {
 *         this.buildType();
 *         ...
 *         return this.getResult();
 *     }
 * }
 */

public class ActorController {
    public Actor construct(ActorBuilder builder) {
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        return builder.getResult();
    }
}
