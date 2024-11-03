package com.casuallycoding.stringbuilderdemo;

public class BuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //默认长度 16，每次扩容 *2+2，不够就扩容到需要的实际长度
        //使用场景：拼接字符串，反转字符串
        sb.append("abc");
        sb.append("123");
        sb.reverse();//反转
        System.out.println(sb.length());
        sb.append("aaaaa").append("bbbbb");
        System.out.println(sb);
        String ans = sb.toString();
        System.out.println(is("1"));
    }
    public static boolean is(String str){
        StringBuilder rev = new StringBuilder(str);
        if(str.contentEquals(rev.reverse())){
            return true;
        }
        else {
            return false;
        }
    }
}
