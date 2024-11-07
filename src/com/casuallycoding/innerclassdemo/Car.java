package com.casuallycoding.innerclassdemo;

public class Car {//外部类不能直接调用内部类的成员，要先创建对象
    private String carBrand;
    private int carAge;
    private int carColor;

    //成员内部类
    class Engine {//内部类可以直接调用外部类成员，包括private
        String engineBrand;
        int engineAge;


    }
}
