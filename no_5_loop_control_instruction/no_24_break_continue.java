package no_5_loop_control_instruction;

/**
 * no_24_break_continue
 */
public class no_24_break_continue {

    public static void main(String[] args) {
        
//--------------> BREAK AND CONTINUE USING LOOPS !! <---------------

        // for (int i=0; i<5; i++) {
        //     System.out.println("Java is great \n"+i);
            
        //     if(i==2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
   
        // }

        // int i = 10;
        // while (i<=20) {
        //     System.out.println(i);
        //     i++;
        // if(i==16){
        //     System.out.println(i);
        //     break;
        // }
            
        // }

    // int i = 0;        
    // do {
    //     System.out.println(i);
    //     if(i==10){
    //         System.out.println(i);
    //         break;
    //     }
    //     i++;
    // } while (i<20);       
    
    
// --------------------->> CONTINUE STATEMENT <<--------------------------


    // for (int i = 1; i<20; i++){
    // if(i==10){
    //     System.out.println( "no");
    //     continue;
    // }     
           
    //     System.out.println(i);
    
    // }

    
    // int i=0;
        
    // while (i<=30) {
    //     i++;
    // if (i==15) {
    //     System.out.println(i+15);
    //     continue;
    //  }   
     
           
    //     System.out.println(i);
        
    
    // }

    int i = 0;    
    do {
        i++;
    if(i==10){
        System.out.println(i*2);
        continue;
    }
        System.out.println(i);  
    } while (i<20);




    }
}