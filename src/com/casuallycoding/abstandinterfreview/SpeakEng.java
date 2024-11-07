package com.casuallycoding.abstandinterfreview;

public interface SpeakEng {
    default void speak() {
        System.out.println("说英语");
    }
}
