package com.casuallycoding.polymorphismreview;

public class Person {
    private String name;
    private int age;

    static {
        System.out.println("静态代码块，随类加载而加载，只执行一次");
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog d) {
            System.out.println(
                    "年龄为" + age + "岁的" + name + "养了一只" + d.getColor() + "颜色的狗"
            );
            d.eat(something);
            d.lookHome();
        }
        else if (animal instanceof Cat c) {
            System.out.println(
                    "年龄为" + age + "岁的" + name + "养了一只" + c.getColor() + "颜色的狗"
            );
            c.eat(something);
            c.catchMouse();
        }
        else {
            System.out.println("invalid input");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
