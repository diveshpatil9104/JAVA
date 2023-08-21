package no_6_arrays;


/**
 * no_28_multidimensional_arrays
 */
public class no_28_multidimensional_arrays {

    public static void main(String[] args) {
//        int [] marks ;  // A 1-D ARRAY
        int [] [] flats; // A 2-D ARRAY
        flats = new int [2][3]; 
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        
// ----->  Displying the 2d array (for loop) <------
        System.out.println("Printing a 2-D array using for loop");

        for(int i=0; i<=flats.length; i++){    // flat length is 2
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}