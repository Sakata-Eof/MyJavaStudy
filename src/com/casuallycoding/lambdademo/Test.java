package com.casuallycoding.lambdademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"a", "aaaa", "aaa", "aa"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.forEach(s -> System.out.println(s));
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));
        list2.forEach(s -> System.out.println(s));
        Vector<Integer> vec = new Vector<>();
        
    }
}
