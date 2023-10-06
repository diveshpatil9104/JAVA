package no_15_advanced_java_1;

public class no_81_date {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());  // NUMBER OF MILISEC PASSED SINCE 1 JAN 1970 
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // NUMBER OF YEARS PASS SINCE 1 JAN 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24);  // NUMBER OF DAYS PASS SINCE 1 JAN 1970
        System.out.println(System.currentTimeMillis()/1000/3600); // NUMBER OF HOURS PASS SINCE 1 JAN 1970
        System.out.println(System.currentTimeMillis()/1000);   // NUMBER OF SECS PASS SINCE 1 JAN 1970 

        
    }
}

/* 
 DATE & TIME IN JAVA :

 java.time ----> PACKAGE FOR DATE AND TIME FROM JAVA 8 ONWORDS
                BEFORE JAVA 8 , java.util PACKAGE USE TO HOLD TO DATE AND TIME CLASSES NOW THESE CLASSES ARE DEPRECATED

HOW JAVA STORES A DATE : 

DATE IN JAVA IS STORED IN THE FORM OF LONG NUMBER.. THIS LONG NUMBER HOLDS THE NUMBER OF MILLISEC 
PASSED SINCE 1 JAN 1970..

JAVA ASSUME THAT 1900 IS A START YEAR IT MEANS IT CALCULATE YEARS PASSED SINCE 1900 WHENEVER WE ASK IT FOR YEARS PASSED..

System.CurrentTimeMills() - RETURNS NO. OF SECONDS PASSED ONCE NO. OF MILLISECONDS ARE CALCULATED , WE CAN CALCULATE 
MINUTE , SEC AND YEARS PASSED ..
*/




