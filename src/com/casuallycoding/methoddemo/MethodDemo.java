package com.casuallycoding.methoddemo;

public class MethodDemo {
    public static void main(String[] args) {
        double ans = CircleArea(10.0);
        System.out.println(ans);
        System.out.println(MySum(1, 2));
        System.out.println(MySum(1, 2, 3));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(FindMax(arr));
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

}
