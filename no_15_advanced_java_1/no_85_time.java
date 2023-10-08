package no_15_advanced_java_1;

import java.time.LocalDate;         //  time api
import java.time.LocalDateTime;
import java.time.LocalTime;

public class no_85_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);


        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        
    }
}
