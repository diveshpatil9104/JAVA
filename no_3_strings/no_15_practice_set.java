package no_3_strings;


/**
 * no_15_practice_set
 */
public class no_15_practice_set {

    public static void main(String[] args) {
        
//QN NO.1 ----> WRITE A JAVA PROGRAM TO CONVERT A STRING TO  lowecase..🙄

        String name1 = "MY nAme is raj Patil";
        System.out.println(name1.toLowerCase());


//QN NO.2 ----> WRITE A JAVA PROGRAM TO REPLACE SPACES WITH UNDERSCORES..😗

        String name2 = "my name is raj patil";
        System.out.println(name2.replace(" ", "_"));

//QN NO.3 ----> WRITE A JAVA PROGRAM TO FILL IN A LRTTER TEMPLATE WHICH LOOKS LIKE BELOW = 🧐
                    // letter = "dear <|name|> , thanks a lot"
                    // replace <|name|> with a ur name 

          
           String letter = "dear <|name|> , thanks a lot";
           System.out.println(letter.replace("<|name|>", "raj patil"));


//QN NO.4 ----> WRITE A JAVA PROGRAM TO DETECT DOUBLE AND TRIPLE SPACES IN A STRING..🤓

           String name3 = "this string contains  double and    triple spaces";
           System.out.println(name3.indexOf("   "));
           System.out.println(name3.indexOf("  ")); 


//QN NO.5 ----> WRITE A PROGRAM TO FORMAT THE FOLLOWING LETTER USING EACAPE SEQUENCE CHARACTER..😎
                // letter2 = "dear Raj, This java course is nice thanks"

            System.out.println("\"dear Raj, \n This java course is nice..\n\t thanks\"");





    }
}