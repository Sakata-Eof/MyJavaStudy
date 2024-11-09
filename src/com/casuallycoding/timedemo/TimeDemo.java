package com.casuallycoding.timedemo;

import java.time.Instant;
import java.time.ZoneId;

public class TimeDemo {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds().size());
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("America/Los_Angeles"));
        System.out.println(Instant.now());
        System.out.println(Instant.ofEpochMilli(1L));
        System.out.println(Instant.ofEpochSecond(1L));
        System.out.println(Instant.ofEpochSecond(1L, 2));
        System.out.println(Instant.now().atZone(ZoneId.of("America/Los_Angeles")));
    }
}
