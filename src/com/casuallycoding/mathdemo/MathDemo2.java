package com.casuallycoding.mathdemo;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(997));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
