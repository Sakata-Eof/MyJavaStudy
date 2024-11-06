package com.casuallycoding.abstandinterfreview;

import javax.xml.transform.Source;

public class PingPongCoach extends Coach implements SpeakEng {
    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    public PingPongCoach() {
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
