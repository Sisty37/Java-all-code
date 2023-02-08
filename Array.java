
package array;

import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        
        double[] number=new double[5];
        double sum=0;
        
        System.out.println("Enter 5 number=");
        
        //for (int i = 0; i < 5; i++)
          for (int i = 0; i < number.length; i++)   
        
        {
            
          number[i]=input.nextDouble();  
            
        }
        
       // for (int i = 0; i < 5; i++)
             for (int i = 0; i<number.length; i++)
        {
            
            sum=sum+number[i];
            
        }
       
       double avg=sum/number.length;
        System.out.println("The sum is="+sum);
        System.out.println("Average is="+avg);
        
    //>>> Find Maximum & minimum number    
       double max=number[0] ;
       double min=number[0];
       
       for (int i = 1; i < 5; i++) {
            
          if(max<number[i])
             {
                max=number[i];
             }
          if(max<number[i])
          {
                min=number[i];
             }
        }
       
        System.out.println("Maximum number="+max);
        System.out.println("Minimum number="+min);
       
    }
    
}
