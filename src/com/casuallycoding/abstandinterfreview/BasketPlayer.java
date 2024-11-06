package com.casuallycoding.abstandinterfreview;

public class BasketPlayer extends Athelete {
    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    public BasketPlayer() {
    }

    @Override
    public void learn() {
        System.out.println("学打篮球");
    }
}
