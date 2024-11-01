package com.casuallycoding.car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car SU7 = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入该车的品牌");
        SU7.setBrand(sc.next());
        System.out.println("请输入该车的价格");
        SU7.setPrice(sc.nextInt());
        System.out.println("请输入该车的颜色");
        SU7.setColor(sc.next());

        System.out.println(SU7.toString());
    }
}
