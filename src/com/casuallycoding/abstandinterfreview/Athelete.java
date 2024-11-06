package com.casuallycoding.abstandinterfreview;

public abstract class Athelete extends Person {
    public Athelete() {
    }

    public Athelete(String name, int age) {
        super(name, age);
    }

    public abstract void learn();
}
