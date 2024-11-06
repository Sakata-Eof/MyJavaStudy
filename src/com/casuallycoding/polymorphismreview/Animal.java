package com.casuallycoding.polymorphismreview;

public abstract class Animal {
    private int age;
    private String color;

    //构造代码块，构造时先于构造方法使用，构造方法中有重复代码时使用
    {
        System.out.println("构造一个动物");
    }

    public Animal() {
        System.out.println("构造方法");
    }

    public abstract void eat(String something);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
