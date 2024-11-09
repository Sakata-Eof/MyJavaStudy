package com.casuallycoding.regexdemo;

import java.sql.SQLOutput;

public class RegexDemo {
    public static void main(String[] args) {
        System.out.println("sakatae@nuaa.edu.cn".matches("(([^<>()\\[\\]\\.,;:\s@\"]+(\\.[^<>()\\[\\]\\.,;:\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))"));
        System.out.println();
    }
}
