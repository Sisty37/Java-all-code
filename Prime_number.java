
package prime_number;

import java.util.Scanner;


public class Prime_number {

    public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
     int num;
        System.out.println("Enter any number");
        
        num=input.nextInt();
        int count=0;
        for (int i = 2; i <num; i++) {
            
            if(num%i==0)
            {
                count++;
                break;
            }         
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else
            System.out.println("not prime ");
     
    }
    
}
