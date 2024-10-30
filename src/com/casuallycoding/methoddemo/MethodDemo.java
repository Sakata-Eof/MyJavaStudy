package com.casuallycoding.methoddemo;

public class MethodDemo {
    public static void main(String[] args) {
        double ans = CircleArea(10.0);
        System.out.println(ans);
        System.out.println(MySum(1, 2));
        System.out.println(MySum(1, 2, 3));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(FindMax(arr));
        int[] arr2 = CopyOfRange(arr, 0, 3);
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
    public static double CircleArea(double radius){
        return radius*radius*3.14;
    }
    public static int MySum(int num1, int num2){
        return num1 + num2;
    }
    public static int MySum(int num1,int num2, int num3){
        return num1 + num2 + num3;
    }
    public static int FindMax(int [] arr){
        int ans = -2147483648;
        for (int i : arr) {
            if(i > ans){
                ans = i;
            }
        }
        return ans;
    }

    public static int[] CopyOfRange(int[] arr, int from, int to) {
        int[] ans = new int[to - from + 1];
        for (int i = from, j = 0; i <= to; i++, j++) {
            ans[j] = arr[i];
        }
        return ans;
    }
}
