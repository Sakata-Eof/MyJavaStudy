package com.casuallycoding.stringdemo2;

public class StringTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 33, 453};
        String str = arrToString(arr);
        System.out.println(str);
        System.out.println(stringReverse(str));
    }

    private static String arrToString(int[] arr) {
        String str = "[ ";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length - 1) {
                str += ", ";
            }
        }
        str += " ]";
        return str;
    }

    public static String stringReverse(String str) {
        char[] chars = new char[str.length()];
        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            chars[j] = str.charAt(i);
        }
        return new String(chars);
    }
}
