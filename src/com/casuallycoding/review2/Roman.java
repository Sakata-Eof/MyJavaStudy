package com.casuallycoding.review2;

import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个0~999999999的整数: ");
        int input = sc.nextInt();
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String s = input + "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(arr[s.charAt(i)-'0']);
        }
        System.out.println(sb);
    }
}
