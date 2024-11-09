package com.casuallycoding.objectdemo;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Object obj1 = null;
        Object obj2 = new Object();
        System.out.println(Objects.equals(obj1, obj2));
        System.out.println(Objects.isNull(obj1));
        System.out.println(Objects.nonNull(obj2));
    }
}
