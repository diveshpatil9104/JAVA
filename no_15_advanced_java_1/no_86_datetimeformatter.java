package no_15_advanced_java_1;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class no_86_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);                             // tthis is date
        // for format date and time we use DateTimeFormatter

        DateTimeFormatter df = DateTimeFormatter.ofPattern("\n E dd MMM h:m a");       // this is a formatter 
        String myDate = dt.format(df);          // creating e string using ate and format
        System.out.println(myDate);

    }
}
