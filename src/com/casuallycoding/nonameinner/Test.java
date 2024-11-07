package com.casuallycoding.nonameinner;

public class Test {
    public static void main(String[] args) {
        new Swim() {//没有名字的内部类，实现了接口
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };

        method(new Animal() {//没有名字的类，是Animal的子类
            //就不用重新编一个子类了
            @Override
            public void eat() {
                System.out.println("eat");
            }
        });


    }

    public static void method(Animal a) {
        a.eat();
    }
}
