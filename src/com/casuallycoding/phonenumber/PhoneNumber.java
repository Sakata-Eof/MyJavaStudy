package com.casuallycoding.phonenumber;

public class PhoneNumber {
    public static void main(String[] args) {
        String number = "18652022301";
        String s1 = number.substring(0, 3);//左闭右开
        String s2 = number.substring(7);
        System.out.println(s1+"****"+s2);
    }
}
