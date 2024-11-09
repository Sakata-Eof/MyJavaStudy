package com.casuallycoding.systemdemo;

import java.util.ArrayList;
import java.util.Collections;

public class SystemDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(' ');
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, 5);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
