package com.casuallycoding.jump7;

import java.util.Scanner;

public class Jump7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            } else {
                int temp = i;
                while (temp != 0) {
                    if (temp % 10 == 7) {
                        System.out.print(i + " ");
                        break;
                    } else {
                        temp = temp / 10;
                    }
                }
            }
        }

    }
}
