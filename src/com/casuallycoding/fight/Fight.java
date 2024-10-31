package com.casuallycoding.fight;

import java.util.Random;

public class Fight {
    public static void main(String[] args) {
        Fighter gojo = new Fighter("五条悟", 1000, 500);
        Fighter sukuna = new Fighter("宿傩", 50000, 10);
        Random rand = new Random();
        while (true) {
            if (rand.nextBoolean()) {
                gojo.attack(sukuna);
                if (sukuna.getHealth() == 0) {
                    System.out.println("会赢的");
                    break;
                }
            }
            else {
                sukuna.attack(gojo);
                if (gojo.getHealth() == 0) {
                    System.out.println("真是令人愉悦啊，我永远不会忘记你");
                    break;
                }
            }
        }
    }
}
