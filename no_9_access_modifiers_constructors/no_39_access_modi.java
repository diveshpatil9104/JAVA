package no_9_access_modifiers_constructors;


public class no_39_access_modi {

    public static void main(String[] args) {

          
        BankAccount myacc = new BankAccount();
        myacc.username = "divesh";      // here it assign due to public access modifire 
        System.out.println(myacc.username);     // and accessable due to public access modifire 
        
        
        // myacc.password = "1234";     // here we cant change password dur to private modifire and this line throws an error
        myacc.setpass("12345");     // here we set password by using function and methods  but it is not accessable  
        
   
  
    }

    
}



// --------------------->>  ACCESS MODIFIRES <<----------------

/* 
|-----------------------------------------------------------------------------------------------------------------|
| ACCESS MODIFIRES |  WITH CLASS  |  WITHIN PACKAGE  |  OUTSIDE PACKAGE BY SUBCLASS ONLY   |   OUTSIDE PACKAGE    |    
|------------------|--------------|------------------|-------------------------------------|----------------------|                
| 1.  private      |       Y      |         N        |               N                     |              N       |   
| 2.  default      |       Y      |         Y        |               N                     |              N       |   
| 3.  protected    |       Y      |         Y        |               Y                     |              N       |
| 4.  public       |       Y      |         Y        |               Y                     |              Y       |    
|------------------|--------------|------------------|-------------------------------------|----------------------|




*/

//CREATING A OBJECT FOR BANK ACCOUNT (CONFIDENTIAL IMFORMATION )

class BankAccount{
    public String username;
    private String password;


    public void setpass(String pwd){
        pwd=password;
        
    }
}