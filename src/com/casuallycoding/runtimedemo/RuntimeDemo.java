package com.casuallycoding.runtimedemo;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory());//单位字节
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().totalMemory());//已获得的内存
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
        Runtime.getRuntime().exec("notepad");//cmd命令
    }
}
