package no_16_advanced2_java;



/* 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
*/
public class no_096_file_handling {
    public static void main(String[] args) {
        // Code to create a file pathname is pass through File instance ..
/* 
        File MyFile = new File("/Users/divesh/java programs/no_16_advanced2_java/no_097_MyFile.txt");
        try{
        MyFile.createNewFile();
        }
        catch(Exception e){
            System.out.println("File Does not create");
            e.getStackTrace();
        }
*/
        // Code for write a file... comment out above code bcoz our file is genetrated 
/* 
        try (FileWriter MyfileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_097_MyFile.txt")) {
            MyfileWriter.write("This is our file from this java notes\n OK Thank You!!");
            MyfileWriter.close();    // needed
        } catch (IOException e) {

            e.printStackTrace();
        }
*/

        // Reading the file 
/* 
        File ReadFile = new File("/Users/divesh/java programs/no_16_advanced2_java/no_097_MyFile.txt");
        
        try {
            Scanner sc = new Scanner(ReadFile);
            while (sc.hasNextLine()) {
                String lines = sc.nextLine();
                System.out.println(lines);
                
            }
            sc.close();
            
        } catch (Exception e) {

        }
*/
        // Deleting the file 
/*    
        File DeleteFile = new File("/Users/divesh/java programs/no_16_advanced2_java/no_097_MyFile.txt");

        if (DeleteFile.delete()) {
            System.out.println("file is deleted");
            
        }
        else{
            System.out.println("Some Problem is occur while deleting the file ");
        }
*/ 
        
    }
}


/*
---- FILE HANDLING IN JAVA 
• READING FROM AND WRITING TO FILES IS AN IMPORTANT ASPECT OF ANY PROGRAMMING LANGUAGE 
    WE CAN USE A FILE CLASS IN JAVA TO CREATE A FILE OBJECT 

    CreateNewFile();  method ----> CREATE A FILE OBJECT
    
• FOR READING FILES WE CAN TI SAME SCANNER CLASS AND SUPPLY IT TO FILE OBJECT 

• FOR DELETE A FILE IN JAVA WE CAN USE FILE OBJECT delete(); METHOD
*/







