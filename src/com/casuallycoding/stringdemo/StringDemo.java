package com.casuallycoding.stringdemo;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your username: ");
            String username = sc.next();
            System.out.println("Enter your password: ");
            String password = sc.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("You have successfully logged in!");
                break;
            }
            else if (username.equals(rightUsername)) {
                System.out.println("Wrong password! " + (3 - i - 1) + " trials left.");
            }
            else {
                System.out.println("Wrong username or password! " + (3 - i - 1) + " trials left.");
            }
        }
    }
}
