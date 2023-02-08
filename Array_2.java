
package array_2;

import java.util.Scanner;

public class Array_2 {

   
    public static void main(String[] args) {
         Scanner input =new Scanner (System.in);
         
         //String[] names=new String[4];
         String[] names={"abu", "jafar", "sisty","rabbi"};
          
         for(String x : names)
         {
        System.out.println("names="+x);
         }
        
         int[] num={10,20,30,40,50,60};
         
         for(int x : num)
           
         {
             System.out.println("number="+x);
         }
        
     //>>>> Sum of those numbers
     
        int[] num2={10,20,30,40,50,60,70};
         int sum=0;
         
         for(int x : num2){
             sum=sum+x;
         }
          System.out.print("sum="+sum);
           
    }
    
}
