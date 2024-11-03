package com.casuallycoding.substringdemo;

public class SubStringDemo {
    public static void main(String[] args) {
        String ID = "330329200307081653";
        String year = ID.substring(6, 10);
        String month = ID.substring(10, 12);
        String day = ID.substring(12, 14);
        char gender = ID.charAt(16);
        System.out.printf("%s年%s月%s日\n", year, month, day);
        if ((gender - '0') % 2 == 0) {
            System.out.println("性别：女");
        }
        else {
            System.out.println("性别：男");
        }
    }

}
