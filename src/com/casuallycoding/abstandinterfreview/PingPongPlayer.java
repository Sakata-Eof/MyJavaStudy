package com.casuallycoding.abstandinterfreview;

public class PingPongPlayer extends Athelete implements SpeakEng {
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }
    
}
