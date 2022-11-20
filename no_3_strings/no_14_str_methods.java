package no_3_strings;

/**
 * no_14_str_methods
 */
public class no_14_str_methods {

    public static void main(String[] args) {
        String name = "   Raj Patil   ";
        // String a1 = new String("raj patil");
        int value = name.length();  //number of character present in string 
        String value2 = name.toLowerCase();
        String value3 = name.toUpperCase();
        String value4 = name.trim(); //(this function remove first and last space and trimed)
        String value5 = name.substring(4,9);  //returns a substring from start index ..start index is included and end is excluded...

        System.out.println(name);
        System.out.println(value); 
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value3.toUpperCase());  //we also use function by this meathod
        System.out.println(value4);
        System.out.println(value4.trim());
        System.out.println(name.substring(8)); //this function read string from index no 8 to end ...
        System.out.println(value5);  //returns a substring from start index ..start index is included and end is excluded...
        System.out.println(name.replace('j','m')); //returns a new string after replaceing r with m...ram is retured in this case 
        System.out.println(name.replace("Raj", "tejas"));
        System.out.println(name.startsWith("hey")); //----> returns true if name starts with "hey" false in this case 
        System.out.println(name.endsWith("til")); //----> returns true if name ends with string "til"..true in this case 
        System.out.println(name.charAt(3)); //----> returns character at a given index position .. R in this case!
        System.out.println(name.indexOf("Patil")); //----> returns the index of the given string .....
                                                         //      for eg.. name.indesOF("patil"") returns 7 which is the first 
                                                         //      occirance of "patil" in string "raj patil",-1 otherwise
    
        System.out.println(name.indexOf("a", 7)); //----> returns index of the given string fron index 7.. (8) in this case
        
                       //====> note = here lastIndexOF searching right to left <======//  
        
        System.out.println(name.lastIndexOf("a"));  //----> returns the last imdex of the given string  .. 8 in this case                                                   
        System.out.println(name.lastIndexOf("a", 4 )); //----> returns index of the given string before index 4..(4) in this case
        System.out.println(name.equals("a")); //----> returns true if the given string is equal to "a" false otherwise [case sensitive]
                                                            // here given string is "Raj patil" hence result is false..
    
        System.out.println(name.equalsIgnoreCase("   raj pAtil   ")); //----> returns true if the given string is equal to "raj patil" false otherwise [not case sensitive]
          
                                //====>  escape sequence character <=====//

        System.out.println("my name is\nraj patil");    // Insert a newline in the text at this point.
        System.out.println("my name is \'raj patil\'"); // Insert a backslash character in the text at this point.
        System.out.println("\"my name is raj patil\""); // Insert a double quote character in the text at this point.
        System.out.println("my name is\traj patil");    // Insert a tab in the text at this point.
        System.out.println("my name is\\raj patil");    // Insert a backslash character in the text at this point.
        System.out.println("my name is\braj patil");    // Insert a backspace in the text at this point.
        System.out.println("my name is\fraj patil");    // Insert a form feed in the text at this point.
        System.out.println("my name\r is raj patil");   // Insert a carriage return in the text at this point.

   
   
   
    }                                           

}   