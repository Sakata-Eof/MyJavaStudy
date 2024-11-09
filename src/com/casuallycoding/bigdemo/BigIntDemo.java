package com.casuallycoding.bigdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntDemo {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger(20, new Random());
        System.out.println(bi1);
        BigInteger bi2 = new BigInteger("288957184789731289730975827509127839570");
        System.out.println(bi2);
        BigInteger bi3 = new BigInteger("001111010111011", 2);
        System.out.println(bi3);
        System.out.println(BigInteger.valueOf(1092849081123123123L));
        //valueof()对 -16 ~ 16 有优化， 不会重复创建空间
        System.out.println(bi2.pow(4));
    }
}
