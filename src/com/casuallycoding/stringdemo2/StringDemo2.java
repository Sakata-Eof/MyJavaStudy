package com.casuallycoding.stringdemo2;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string:");
        String s = sc.next();
        int upperCount = 0, lowerCount = 0, numCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upperCount++;
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lowerCount++;
            }
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numCount++;
            }
        }
        System.out.println(upperCount + " " + lowerCount + " " + numCount);

    }
}
