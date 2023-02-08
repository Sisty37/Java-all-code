
package pattern_nested_loop;

import java.util.Scanner;

public class Pattern_Nested_Loop {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,row,col;
        
        System.out.print("Enter any number=");
        n=input.nextInt();
        
        for (row = 1; row<=n; row++)
            //for(row=n; row>=1; row--)   
        {
            
            for (col = 1; col<=row; col++) {
                
                
                System.out.print(" "+col);
                
               // System.out.print(" * ");
                //System.out.print(" # ");
               // System.out.print(" "+row);
                
                //System.out.print(" "+col%2);
                //System.out.print(" "+row%2);
               // System.out.print(" " +row*col);
                
            }
           
            System.out.println(" ");
            
        }
        
        
         
    }
    
}
