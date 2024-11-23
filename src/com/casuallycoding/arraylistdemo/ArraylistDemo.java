package com.casuallycoding.arraylistdemo;

import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//默认容量为零
        System.out.println(list);
        list.add("aaa");//初次添加容量加为10，满容量再扩1.5倍，若扩容还不能满足，则容量为实际长度
        list.add("bbb");
        list.add("ccc");
        System.out.println(list.remove("ccc"));
        System.out.println(list);
        list.set(0, "ddd");
        System.out.println(list);
        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
    }
}
