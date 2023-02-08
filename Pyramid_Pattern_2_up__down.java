
package pyramid_pattern_2_up_._down;

import java.util.Scanner;


public class Pyramid_Pattern_2_up__down {

   
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n,row,col;
        
        System.out.print("Enter any number=");
        n=input.nextInt();
        
        for (row = 1;  row<=n; row++) {
            
            for (col = 1;  col<=n-row; col++) 
            
            {
                
                System.out.print(" ");
                
            }
 
           
            for (col = 1; col<=2*row-1; col++) {
                // number of star er jonno 2*row-1
                //                        2*1-1=1
                //                        2*2-1=3
                //                        2*3-1=5
                //                        2*4-1=7
                //                        2*5-1=9
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
        
       //down
       
        for (row =n-1;  row>=1; row--) {
            
            for (col = 1;  col<=n-row; col++) 
            
            {
                
                System.out.print(" ");
                
            }
 
           
            for (col = 1; col<=2*row-1; col++) {
                // number of star er jonno 2*row-1
                //                        2*1-1=1
                //                        2*2-1=3
                //                        2*3-1=5
                //                        2*4-1=7
                //                        2*5-1=9
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
        
        
    
        
        
    }
    
}
