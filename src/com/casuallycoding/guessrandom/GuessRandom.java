package com.casuallycoding.guessrandom;

import java.util.Random;
import java.util.Scanner;

public class GuessRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(1, 100);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入1~100间的任意一个数：");
            int guess = sc.nextInt();
            if (guess > 100 || guess < 0) {
                System.out.println("非法输入");
            }
            else if (guess == target) {
                System.out.println("正确");
                break;
            }
            else if (guess < target) {
                System.out.println("小了");
            }
            else {
                System.out.println("大了");
            }
        }
    }
}
