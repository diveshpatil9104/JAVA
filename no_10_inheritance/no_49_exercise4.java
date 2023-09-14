package no_10_inheritance;

import java.util.Scanner;

public class no_49_exercise4 {
    public static void main(String[] args) {
        
/* 
        EXERCISE 4 ----->>
        
    YOU HAVE TO IMPLEMENT LIBRARY USING JAVA CLASS LIBRARY ..
    METHODS :    ADDBOOK , ISSUEBOOK , RETURNBOOK , SHOWAVAILABLEBOOKS
    PROPERTIES : ARRAY TO STORED THE AVAILABLE BOOKS
    ARRAY TO STORED THE ISSUE BOOK 
    
*/



        System.out.println("\n\t\t Welcome to online Library Management System 📖 ");
        Library library = new Library();
        try (Scanner sc = new Scanner(System.in)) {         //----> This feature simplifies resource management and helps prevent resource leaks in your Java programs.
            
            while (true) {
                
                System.out.println("\n ENTER 1 FOR ADD BOOK \n ENTER 2 FOR ISSUE BOOK \n ENTER 3 FOR RETURN BOOK \n ENTER 4 FOR SHOW AVAILABLE BOOKS\n ENTER 5 FOR EXITING LIBRARY\n" + //
                        "");
                System.out.print("Your Choice : ");
                int user = sc.nextInt();
                

   
                   
                if (user == 1) {
                    System.out.print(" Enter book name you want to Add : ");
                    String nameofbook = sc.nextLine() + sc.nextLine();      // another nextline is for avoiding input buffer
                    library.addBook(nameofbook);
                    System.out.println(nameofbook + " Book has been added");
                }
                
                else if (user ==4){
                    library.ShowAvailableBooks();
                }
                
                else if (user == 2) {
                    System.out.print("Enter the name of book which you want to issue : ");
                    String issuebook = sc.nextLine()+sc.nextLine();
                    library.IssueBook(issuebook);
                    
                }
                else if(user == 3){
                    System.out.print("Enter the name of book which you want to return : ");
                    String returnbook = sc.nextLine()+sc.nextLine();
                    library.returnBook(returnbook);

                }
                else if (user == 5) {
                    System.out.println("Exiting the library system. Goodbye!");
                    break; // Exit the loop
                
                }
                else{
                    System.out.println(" Choose correct number");
                }
                
                    
                     
                 
            }

        }
    
    }

}

class Library{

        String []books = new String[100];
        int no_of_books;
        
        
    Library(){
      this.books = new String[100];

    
        
        books[0] = "To Kill a Mockingbird";
        books[1] = "1984";
        books[2] = "The Great Gatsby";
        books[3] = "Pride and Prejudice";
        books[4] = "The Catcher in the Rye";
        books[5] = "The Hobbit";
        books[6] = "Fahrenheit 451";
        books[7] = "The Lord of the Rings";
        books[8] = "Brave New World";
        books[9] = "The Diary of Anne Frank";
        books[10] = "The Alchemist";
        books[11] = "The Kite Runner";
        books[12] = "The Hunger Games";
        books[13] = "The Da Vinci Code";
        books[14] = "The Shining";
        books[15] = "The Girl with the Dragon Tattoo";
        books[16] = "Harry Potter and the Sorcerer's Stone";
        books[17] = "The Road";
        books[18] = "Gone with the Wind";
        books[19] = "The Hitchhiker's Guide to the Galaxy";
        books[20] = "The Little Prince";
        books[21] = "The Chronicles of Narnia";
        books[22] = "The Grapes of Wrath";
        books[23] = "The Outsiders";
        books[24] = "The Godfather";
        books[25] = "A Song of Ice and Fire";
        books[26] = "The Fault in Our Stars";
        books[27] = "The Help";
        books[28] = "The Sun Also Rises";
        books[29] = "The Picture of Dorian Gray";
        books[30] = "The Secret Garden";
        books[31] = "The Color Purple";
        books[32] = "The Name of the Wind";
        books[33] = "The Giver";
        books[34] = "The Girl on the Train";
        books[35] = "The Book Thief";
        books[36] = "The Handmaid's Tale";
        books[37] = "The Sound and the Fury";
        books[38] = "The Lovely Bones";
        books[39] = "The Old Man and the Sea";

        no_of_books= 40;
    
    }

    
    
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++; 
        
    }
    

    
    void ShowAvailableBooks(){
        int booknum = 1;
        System.out.println("\n Available books are\n ");
        // for (String book : this.books) {
        //     if (book == null) {
        //         continue;
        //     }
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    continue;
                    
                }
                System.out.println("❖"+booknum+"\t" + books[i]);
                booknum++;   

            }

    }
            
            
    
    void IssueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("\n Book has been issued");
                this.books[i] = null;
                return;
            }
        }
    
    System.out.println("\n Book not found");
    
    }

    

    void returnBook(String book){
        addBook(book);
        System.out.println(" thank you !! your book has been returned");
    
    }


}

