package com.casuallycoding.polymorphismreview;

public class Test {
    public static void main(String[] args) {
        Person laowang = new Person();
        laowang.setName("老王");
        laowang.setAge(30);
        Person laoli = new Person();
        laoli.setName("老李");
        laoli.setAge(25);
        Animal dog = new Dog();
        dog.setAge(2);
        dog.setColor("黑");
        Animal cat = new Cat();
        cat.setAge(3);
        cat.setColor("灰");
        laowang.keepPet(dog, "骨头");
        laoli.keepPet(cat, "鱼");
    }
}
