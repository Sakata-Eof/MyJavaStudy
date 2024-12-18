package com.casuallycoding.polymorphismreview;

public class Dog extends Animal {
    public void lookHome() {
        System.out.println("狗在看家");
    }

    @Override
    public void eat(String something) {
        System.out.println(
                getAge() + "岁的" + getColor()
                        + "颜色的狗两只前腿死死的抱住" + something + "猛吃"
        );
    }
}
