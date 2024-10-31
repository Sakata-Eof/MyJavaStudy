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
        arr3[2] = 0;
        arr3[1] = 10;
        for (int i : arr3) {
            System.out.println(i);
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println(arr3[2]);
        
    }
}
