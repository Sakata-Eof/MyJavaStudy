package com.casuallycoding.stringjoinerdemo;

import java.util.StringJoiner;

public class JoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i : arr) {
            sj.add(""+i);
        }
        System.out.println(sj);
    }
}
