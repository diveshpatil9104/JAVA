package no_11_abstract_classes_interfaces;

public class no_55_polymorphism {
    public static void main(String[] args) {

        Cammera cammera = new Smartphone();         // THIS IS SMARTPHONE BUT USE AS CAMMERA 
        cammera.recordingin4k();
        cammera.recordvideo();
        cammera.takesnap();
        // cammera.connectnetwork();  ------->> NOT ALLOWED BEACAUSE WE USE CAMMERA REFERENCE FOR SMARTPHONE OBJ 

        Wifi wifi = new Smartphone();
        String[] net = wifi.getnetworks();
        for (String contacts : net) {
            System.out.println(contacts);
        }

        wifi.connectnetwork("divesh");
            

    }
    
}


interface Cammera{

    void takesnap();
    void recordvideo();
   
    default void recordingin4k(){                             // ------->>> CREATING DAFAULT METHOD
        
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
                     ---------------------- POLYMORPHISM -----------------------

        Polymorphism in Java means that different objects can do similar things in their own unique way. 
        It's like having different types of vehicles (e.g., cars, bikes, and trucks) all responding to a "start" command,
        but each type of vehicle starts differently based on its characteristics. 
        
        - COMPILE TIME POLYMORPHISM 
            ● METHOD OVERLOADING - MULTIPLE FUNCTION BUT WITH THE SAME NAME AND DIFFRENT PARAMERTERS
            
        - RUN TIME POLYMORPHISM    
            ● METHOD OVERRIDING - PARENT AND CHILD CLASS BOTH CONTAIN SAME FUNCTION BUT DIFFRENT DEFINATION (WORKING)

*/
        
        
 
 
 
 
 

