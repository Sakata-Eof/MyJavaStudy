package com.casuallycoding.classdemo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.setBrand("Apple");
        iphone.setPrice(9999.0);

        System.out.println(iphone.getBrand());
        System.out.println(iphone.getPrice());
        iphone.Call();
        iphone.PlayGame();
        Phone HUAWEI = new Phone("HUAWEI", 99999.0);
        System.out.println(HUAWEI.getBrand());
        System.out.println(HUAWEI.getPrice());
        HUAWEI.PlayGame();
        HUAWEI.Call();
    }
}
