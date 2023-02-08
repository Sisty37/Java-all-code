
package sorting_in_ascending_and_descending_array;

import java.util.Arrays;

public class Sorting_in_ascending_and_descending_Array {

    public static void main(String[] args) {
        
        int [] number={10, -4,5,7,9};
       
        Arrays.sort(number);
       
        //Ascending
        System.out.print("Ascending:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
        }
         System.out.println();
         
         
         //Descendong
        
        System.out.print("Desending:");
        for (int i = 4; i >=0; i--) {
            
            System.out.print(" "+number[i]);
        }
       
    }
    
}
