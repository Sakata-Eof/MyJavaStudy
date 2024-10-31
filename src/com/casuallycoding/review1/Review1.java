package com.casuallycoding.review1;

import java.util.Random;
import java.util.Scanner;

public class Review1 {
    public static void main(String[] args) {
        //找质数 101~200 间，输出所有并输出个数
        int count = 0;
        boolean is = true;
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    is = false;
                    break;
                }
            }
            if (is) {
                System.out.print(i + " ");
                count++;
            }
            is = true;
        }
        System.out.println();
        System.out.println("共" + count + "个质数");
        System.out.println("验证码：" + GetCode());
        System.out.println("密码是："+GetPassword(1983));
    }

    public static String GetCode() {
        Random rand = new Random();
        String ans = "";
        char c = 'a';
        for (int i = 0; i < 4; i++) {
            if (rand.nextBoolean()) {
                c = (char) rand.nextInt('A', 'Z');
            }
            else {
                c = (char) rand.nextInt('a', 'z');
            }

            ans += c;
        }
        ans += rand.nextInt(0, 9);
        return ans;
    }
    public static String GetPassword(int ori) {
        int len = 1, temp=10;
        while(ori%temp!=ori){
            len++;
            temp *= 10;
        }
        int[] splitted = new int[len];
        for (int i = 0; i < len; i++) {
            splitted[i] = ori % 10;
            ori /= 10;
        }
        for (int i = 0; i < len; i++) {
            splitted[i] += 5;
            splitted[i] %= 10;
        }
        String ans = "";
        for (int i = 0; i < len; i++) {
            ans += splitted[i];
        }
        return ans;
    }
}
