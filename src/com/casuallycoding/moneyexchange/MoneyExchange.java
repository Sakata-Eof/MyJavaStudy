package com.casuallycoding.moneyexchange;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int input = sc.nextInt();
        if (input < 0 || input > 9999999) {
            System.out.println("Invalid input");
        }
        else {
            String temp = "";
            temp += input;
            String ans = exchangeToAns(temp);
            System.out.println(ans);
        }
    }

    private static String exchangeToAns(String input) {
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '0' -> str += '零';
                case '1' -> str += '壹';
                case '2' -> str += '贰';
                case '3' -> str += '叁';
                case '4' -> str += '肆';
                case '5' -> str += '伍';
                case '6' -> str += '陆';
                case '7' -> str += '柒';
                case '8' -> str += '捌';
                case '9' -> str += '玖';
                default -> {
                    System.out.println("Invalid input");
                    return null;
                }
            }
        }
        //System.out.println(str);
        char[] chars = new char[13];
        chars[1] = '佰';
        chars[3] = '拾';
        chars[5] = '万';
        chars[7] = '仟';
        chars[9] = '佰';
        chars[11] = '拾';
        for (int i = 0; i < (7 - str.length()); i++) {
            chars[i * 2] = '零';
        }
        for (int i = 0; i < str.length(); i++) {
            chars[(i + (7 - str.length())) * 2] = str.charAt(i);
        }
        return new String(chars);
    }

}
