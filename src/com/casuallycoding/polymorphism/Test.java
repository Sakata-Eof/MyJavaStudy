package com.casuallycoding.polymorphism;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("李四");
        Administrator a = new Administrator();
        a.setAge(40);
        a.setName("王五");
        register(s);
        register(t);
        register(a);

    }
    //多态
    public static void register(Person p){
        p.show();
    }
}
