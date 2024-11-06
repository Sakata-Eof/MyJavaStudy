package com.casuallycoding.polymorphism;

public class Teacher extends Person {
    @Override
    public void show(){
        System.out.println("教师信息为："+getName()+"，"+getAge());
    }
}
