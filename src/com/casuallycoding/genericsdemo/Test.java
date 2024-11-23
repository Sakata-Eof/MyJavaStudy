package com.casuallycoding.genericsdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Husky> list1 = new ArrayList<>();
        ArrayList<Lihua> list2 = new ArrayList<>();
        ArrayList<Ragdoll> list3 = new ArrayList<>();
        ArrayList<Teddy> list4 = new ArrayList<>();
    }

    public static void keepPet(ArrayList<? extends Animal> list) {//接收所有Animal子类
        for (Animal a : list) {
            a.eat();
        }
    }
}
