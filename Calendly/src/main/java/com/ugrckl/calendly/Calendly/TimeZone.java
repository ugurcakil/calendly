package com.ugrckl.calendly.Calendly;

import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        DateTimeFormatter dtformatter = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' kk:mm ");
        LocalDateTime localDateTime = LocalDateTime.now();
        String zone;
        String ldtString = dtformatter.format(localDateTime);
        System.out.println(ldtString);

        LocalDateTime newTime = localDateTime.minusHours(2);
        String nTime = dtformatter.format(newTime);
        System.out.println(nTime);
    }
}




