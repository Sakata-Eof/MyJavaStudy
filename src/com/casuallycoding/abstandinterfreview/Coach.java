package com.casuallycoding.abstandinterfreview;

public abstract class Coach extends Person {
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void teach();
}
