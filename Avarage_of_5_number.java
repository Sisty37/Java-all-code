
package avarage_of_5_number;

import java.util.Scanner;


public class Avarage_of_5_number {
    

  
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         
         System.out.println("Enter any n number:");
         
         int n;
         int sum=0;
         
         int avg=0;
        
         
         n=input.nextInt();
         
        for (int i = 1; i <=n; i++) {
            System.out.println(" Enter number "+i);
            
            
          sum=sum+input.nextInt();

       
        }
         avg=sum/n;
        System.out.println("Avg= "+avg);
            
      
        
    }
    
}
