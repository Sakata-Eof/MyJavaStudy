package com.casuallycoding.replacedemo;

public class ReplaceDemo {
    public static void main(String[] args) {
        String language = "tmdTMDtmmdSBCNMSCNMB";
        String[] arr = {"TMD", "CNM", "SB"};
        for (String s : arr) {
            language =language.replace(s, "***");
        }
        System.out.println(language);
    }
}
