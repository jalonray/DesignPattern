package com.example;

/**
 * Created by JayRay on 16/02/2017.
 * Info: The actor class for Builder Pattern
 */

public class Actor {
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;

    @Override
    public String toString() {
        return super.toString() +
                "\ntype: " + type +
                "\nsex: " + sex +
                "\nface: " + face +
                "\ncostume: " + costume +
                "\nhairstyle: " + hairstyle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
