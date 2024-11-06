package com.casuallycoding.abstandinterfreview;

public class BasketCoach extends Coach {
    public BasketCoach(String name, int age) {
        super(name, age);
    }

    public BasketCoach() {
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
