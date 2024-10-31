package com.casuallycoding.fight;

import java.util.Random;

public class Fighter {
    private String name;
    private int health;
    private int strength;

    public Fighter() {
    }

    public Fighter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Fighter(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * 设置
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void attack(Fighter fighter) {
        Random random = new Random();
        int damage = random.nextInt(0, fighter.getHealth() / 100 + 1) + random.nextInt(this.strength / 2, this.strength * 2 + 1);
        fighter.setHealth(fighter.getHealth() - damage);
        System.out.println(
                this.name + "命中" + fighter.getName() +
                        ", 造成" + damage + "点伤害, " +
                        fighter.getName() +
                        "还剩" + fighter.getHealth() + "滴血。"
        );


    }

    /**
     * 获取
     *
     * @return strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * 设置
     *
     * @param strength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }
}
