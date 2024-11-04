package com.casuallycoding.mystatic;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("James");
        s1.setAge(23);
        s1.setGender("male");
        Student s2 = new Student();
        s2.setName("John");
        s2.setAge(22);
        s2.setGender("female");
        Student.teacherName = "Li";
        System.out.println(s1);
        System.out.println(s2);
    }
}
