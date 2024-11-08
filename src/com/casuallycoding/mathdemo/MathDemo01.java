package com.casuallycoding.mathdemo;

public class MathDemo01 {
    public static void main(String[] args) {
        int num = -2147483647;
        System.out.println(Math.absExact(num));
        double d = -12.54;
        System.out.println(Math.ceil(d));//向上取整(往数轴右侧取)
        System.out.println(Math.floor(d));//向下取整(往数轴左侧取)
        System.out.println(Math.round(12.34));//四舍五入
        System.out.println(Math.round(12.54));//四舍五入
        System.out.println(Math.round(-12.34));//四舍五入(直接去除小数部分)
        System.out.println(Math.round(-12.54));//四舍五入(直接去除小数部分，整数绝对值增加)
        System.out.println(Math.pow(2, 10));//a的b次幂
    }
}
