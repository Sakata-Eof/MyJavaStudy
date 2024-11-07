package com.casuallycoding.nonameinner;

public class Tested {
    public static void main(String[] args) {
        Swim s = new Swim() {

            @Override
            public void swim() {
                System.out.println("swim");
            }
        };
        s.swim();
        new Swim() {

            @Override
            public void swim() {
                System.out.println("swim");
            }
        }.swim();
    }
}
