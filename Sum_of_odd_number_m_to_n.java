
package sum_of_odd_number_m_to_n;

import java.util.Scanner;


public class Sum_of_odd_number_m_to_n {

   
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
           int m,n,sum;
        sum=0;
        System.out.print("Enter initial number=");
        m=input.nextInt();
        System.out.print("Enter final number=");
        n=input.nextInt();
        
        for (int i = m; i <= n; i++) {
            
            if(i%2 !=0)
            
            sum=sum+i;
            
            
        }
        
        System.out.println("Sum of odd number="+sum);
        
      
            
        
       
    }
    
}
