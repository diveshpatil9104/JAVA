package no_15_advanced_java_1;
/* 
        EXERCISE 5 ----->>
        
    YOU HAVE TO IMPLEMENT LIBRARY USING JAVA CLASS LIBRARY ..
    BOOK SHOULD HAVE INFO LIKE:
    1. BOOK NAME
    2. AUTHOR NAME
    3. ISSUED ON
    4. ISSUED TO
    USER SHOULD ABLE TO : ADDBOOK , ISSUEBOOK , RETURNBOOK , SHOWAVAILABLEBOOKS
    ASSUME THAT ALL THE USER ARE RESISTERED WITH THEIR NAMES IN THE CENTRE DATABASE ...
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class no_88_exercise {
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("\n E dd MMM h:mm a");      
        String myDate = dt.format(df);
        System.out.println("\t\t"+myDate);


        Library mylib = new Library();
        System.out.println("\n--------  ✣✣✣ WLCOME TO THE LIBRARY MANAGEMENT SYSTEM ✣✣✣  -------------");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nENTER YOUR NAME : ");
            String name = sc.nextLine();
            while (true) {
                System.out.println(" \n 1. DISPLAYING BOOKS");
                System.out.println(" 2. ISSUING BOOKS");
                System.out.println(" 3. RETURNING BOOKS");
                System.out.println(" 4. YOUR ISSUED BOOKS");
                System.out.println(" 5. EXIT");
                System.out.print("ENTER UR CHOICE : ");
                mylib.userchoice = sc.nextInt();

                if (mylib.userchoice == 1) {
                    System.out.println("\nAVAILABLE BOOKS ARE : \n");
                    mylib.printbooklist();           
                }
                else if(mylib.userchoice ==2){
                    System.out.print("\nENTER THE INDEX OF BOOK YOU WANT TO ISSUE : \n");
                     mylib.printbooklist();      
                     System.out.print("INDEX :");
                     int index = sc.nextInt();
                     mylib.issuebook(index , name , myDate);
                     

                } 
                else if (mylib.userchoice == 3){
                    System.out.println("\nENTER THE INDEX OF BOOK YOU WANT TO RETURN : ");

                    for (int i = 0; i < mylib.issuebooks.size(); i++) {
                        System.out.println(i+". " +mylib.issuebooks.get(i));
                    }
                        System.out.print("INDEX : ");
                        int index = sc.nextInt();
                        mylib.returnbook(index);
                    
                }   

                else if (mylib.userchoice==4){
                    System.out.println("\nBOOKS ISSUE BY YOU : ");
                    for (String books : mylib.issuebooks) {
                        System.out.println("✠✠ "+books);
                        
                    }
                }

                else if (mylib.userchoice == 5){
                    System.out.println("THANK YOU " + name.toUpperCase() + "!! HAVE A NICE DAY..😃");
                    break;

                }else{
                    System.out.println(name.toUpperCase()+" PLEASE CHOOSE CORRECT YOUR CHOICE");
                }
            }
        }
    }
}
                


class Library{
    ArrayList<String> booklist = new ArrayList<>();
    ArrayList<String> issuebooks = new ArrayList<>();
    int userchoice;

    public Library(){
        booklist.add("Java");
        booklist.add("Python");
        booklist.add("1970");
        booklist.add("DSA");
        booklist.add("Programming");
        booklist.add("Hang Over");
    }  
    public void printbooklist(){
        for (int i = 0; i < booklist.size(); i++) {
            System.out.println(i + "-" + booklist.get(i));
        }
    }

    public void issuebook(int index , String name , String time){
        
        System.out.println("SUCSSESFULLY ISSUE : " + booklist.get(index) + " to "+name.toUpperCase());
        System.out.println("\tISSUED ON: " + time);
        issuebooks.add(booklist.get(index));
        booklist.remove(index);

        

        
    }
            
    public void returnbook(int index){

        System.out.println("SUCSSESFULLY RETURNED : " + issuebooks.get(index));
        

        
        booklist.add(issuebooks.get(index));
        issuebooks.remove(index);

        


    }
}



   

