
package rectangle_star_pattern;

import java.util.Scanner;


public class Rectangle_star_pattern {

    public static void main(String[] args) {
        
         Scanner input=new Scanner(System.in);
        int n,row,col;
        
        System.out.print("Enter any number=");
        n=input.nextInt();
        
        for (row = 1; row<=n; row++)
           
        {
            
            for (col = 1; col<=n; col++) 
            {
                
            if(row==1 || row==n || col==1 || col==n) 
                 
   //Triangle er jonno >>>
      // if(col==1|| row==n || col==row)
   // Cross er jonno>>>
     // if(row==col || row+col==n+1)
       
                    System.out.print("*");
             else
                    System.out.print(" ");
             }   
                
            System.out.println(" ");
         }
        
    }
    
}
