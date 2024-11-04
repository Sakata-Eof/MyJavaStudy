package com.casuallycoding.mystatic;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     */
    public void setGender(String gender) {
        this.gender = gender;
    }


    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", teacherName = " + teacherName + "}";
    }
}
