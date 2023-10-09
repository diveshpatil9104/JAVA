package no_15_advanced_java_1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;


public class no_87_practice_set {
    public static void main(String[] args) {

// QN NO.1 ----> CREATE AN ARRAYLIST AND STORE NAMES OF 10 STUDENTS INSIDE IT .. PRINT IT USING THE FOR:EACH LOOP 

        ArrayList<String> l1 = new ArrayList<>();

        l1.add("harshal");
        l1.add("sagar");
        l1.add("yash");
        l1.add("tejas");
        l1.add("chetan");
        l1.add("teju");
        l1.add("devendra");
        l1.add("jayesh");
        l1.add("harsh");
        l1.add("shubham");

        for (String names : l1) {
            System.out.println(names);
            
        }

// QN NO.2 ----> USE THE DATE CLASS IN JAVA TO PRINT TIME IN THE FOLLOWING FORMAT: 
//                    21 : 30 : 12 

        LocalDateTime d = LocalDateTime.now();

        System.out.println("\n" + d.getHour() + ":" + d.getMinute() + ":" + d.getSecond());

// QN NO.3 ----> REPEAT 2 USING THE CALENDER CLASS USING getTime();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());


// QN NO.4 -----> REPEAT 2 USING TIME API 

        LocalTime d2 = LocalTime.now();
        System.out.println(d2);
      


// QN NO.5 -----> CREATE A SET IN JAVA TRY TO STORED DUPLICATE ELEMENTS INSIDE THIS SET AND VERIFY THAT ONLY ONCE INSTANCE IS STORED

            HashSet<Integer> set = new HashSet<>();

            set.add(43);
            set.add(43);
            set.add(34);
            set.add(32);
            set.add(53);
            System.out.println(set);        // here 43 is print only one time bcoz it is duplicate 


    }
}
