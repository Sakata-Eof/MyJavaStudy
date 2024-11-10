package com.casuallycoding.argsdemo;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5));
    }

    public static int getSum(int sum, int... args) {//可变参数
        //形参中最多只能写一个可变参数,并且只能写在最后
        int ans = 0;
        for (int i : args) {
            ans += i;
        }
        return ans;
    }
}
