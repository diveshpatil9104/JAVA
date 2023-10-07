package no_15_advanced_java_1;


import java.time.LocalDateTime;



public class no_82_dateclass {
    public static void main(String[] args) {
        // QUIZE : IT IS SAFE TO STORE THE NUMBER OF MILLISEC IN THE VARIABLE OF TYPE LONG..

        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        // System.out.println("yes it is very safe to store the number of millisec in the long variable type");

        LocalDateTime date =  LocalDateTime.now();      // Date class is considered as outdated and it's recommanded to use new date class  
                                                        // API introduce in java 8 with the java.time package 
        System.out.println(date);
        System.out.println(date.getHour());    // the number of hours represented by this date.
        System.out.println(date.getMinute()); //the number of minutes represented by this date.
        System.out.println(date.getSecond());  //the number of sec  represented by this date.
        System.out.println(date.getDayOfMonth());   // the day of the month represented by this date.
        System.out.println(date.getMonth());        //the month represented by this date.
        System.out.println(date.getYear());     //the year represented by this date
        System.out.println(date.getDayOfYear());    // currently day of year 
        System.out.println(date.getDayOfWeek());   // day of week (eg . monday)
        System.out.println(date.getDayOfWeek() +" - "+ date.getDayOfMonth() +" : " +date.getHour() + " : "+date.getMinute() + " : "+date.getSecond());

         
    }
}
