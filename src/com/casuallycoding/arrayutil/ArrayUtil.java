package com.casuallycoding.arrayutil;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil() {
    }


    public static String printArray(int[] arr) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i : arr) {
            sj.add(i + "");
        }
        return sj.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0.0;
        for (double v : arr) {
            sum += v;
        }
        return sum / arr.length;
    }
}
