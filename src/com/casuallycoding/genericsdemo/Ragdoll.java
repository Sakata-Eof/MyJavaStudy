package com.casuallycoding.genericsdemo;

public class Ragdoll extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的布偶猫，正在吃小鱼干");
    }
}
