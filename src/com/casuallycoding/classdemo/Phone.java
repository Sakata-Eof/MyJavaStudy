package com.casuallycoding.classdemo;

import java.sql.SQLOutput;

public class Phone {
    private String brand;
    private double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        if (price >= 0.0) {
            this.price = price;
        }
    }

    public Phone() {
        brand = "";
        price = 0.0;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void Call() {
        System.out.println("call");
    }

    public void PlayGame() {
        System.out.println("play");
    }
}
