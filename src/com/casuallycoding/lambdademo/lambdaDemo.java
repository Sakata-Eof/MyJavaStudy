package com.casuallycoding.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 6, 2, 2, 7, 8, 2, 2, 4, 4, 6, 71, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,
                (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }
}
