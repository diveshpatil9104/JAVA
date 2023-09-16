package no_11_abstract_classes_interfaces;



public class no_53_default_methods {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();
        String[] ar = smartphone.getnetworks();
        for (String item : ar) {
            System.out.println(item);
            
        }
        smartphone.callnumber(100);
        smartphone.connectnetwork(" aai");
        smartphone.recordvideo();
        smartphone.recordingin4k();
        
    }
    
}

interface Cammera{

    void takesnap();
    void recordvideo();
    private void massage(){                                   //------->>> INCLUDE PRIVATE METHODS 
        System.out.println("namsate duniya 🙏🏻");  // 
    }

    default void recordingin4k(){                             // ------->>> CREATING DAFAULT METHOD
        
        massage();      // ---->>> calling private methode FOR DEFAULT METHOD TO USE (CURRENTLY NOT WORK BCOZ WE HAVE OVERIDE METHOD) 
       
        System.out.println(" recording in 4k quality");
    }
}

interface Wifi{
    String[] getnetworks();
    void connectnetwork(String phonenumber);

}

class Cellphone{
     void callnumber(int phonenumber){
        System.out.println(" calling " + phonenumber);


    }
    void pickphone(){
        System.out.println("connecting..");
    }
}

class Smartphone extends Cellphone implements Cammera , Wifi{
    @Override
    public void recordingin4k(){
        System.out.println("recording in 4k quality with smartphone");
    }

    public void takesnap(){
        System.out.println("taking snap");
    }

    public void recordvideo(){
        System.out.println("recording ... ");

    }

    public String[] getnetworks(){
        System.out.println("getting list of networks..\n");
        String[] networklist = { "pappa" , "aai" , "teju" , "yash" , "aaji" , "baba"};
        return networklist;
    }

    
    public void connectnetwork(String name) {
        System.out.println("connecting...." + name );

       
    }

}

/* 
                          -------------- DEFAULT METHOD ---------------

-   DEFAULT METHOD ENABLE US TO ADD NEW FUNCTIONALITY TO EXISTING INTERFACES... THIS FEATURE WAS INTRODUCED IN JAVA 8 TO 
-   EXSURE BACKWORD COMPATIBILITY WHILE UPDATING AN INTERFACE 
-   USING THIS METHOD INTERFACES CAN ALSO INCLUDE PRIVATE METHODS FOR DEFAULT METHOD TO USE 
*/


