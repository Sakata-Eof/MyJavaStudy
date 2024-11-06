package com.casuallycoding.polymorphism;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("李四");
        Administrator a = new Administrator();
        a.setAge(40);
        a.setName("王五");
        register(s);
        register(t);
        register(a);
        Person p = new Student();//自动类型转换，只能用有复用的方法及父类的成员变量
        register(p);
        //如果要启用子类的独有功能，要强转，判断类型再转换

        //老写法
        /*if(p instanceof Teacher){
            Teacher t2 = (Teacher) p;
        }
        else if(p instanceof Student){
            Student s2 = (Student) p;
        }*/

        //新写法
        if (p instanceof Teacher t2) {
            //t2.***
        }

    }

    //多态
    public static void register(Person p) {
        p.show();
    }
}
