package com.casuallycoding.arraydemo;

public class ArrDemo {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        int[] arr2 = new int[]{11, 22, 33};
        arr[2] = arr2[1];
        System.out.println(arr[2]);
        for (int j : arr) {
            System.out.println(j);
        }
        int[] arr3 = new int[5];
        System.out.println(arr3[2]);
    }
}
