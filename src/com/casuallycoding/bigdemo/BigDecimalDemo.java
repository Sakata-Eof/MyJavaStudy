package com.casuallycoding.bigdemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.01");
        BigDecimal b2 = new BigDecimal("0.09");
        BigDecimal b3 = new BigDecimal(0.09);//不好用
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.add(b2));
        System.out.println(b1.add(b3));
        BigDecimal b4 = BigDecimal.valueOf(10);//节约内存
    }
}
