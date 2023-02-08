
package Cg_calculate;

import java.math.RoundingMode;


public class Cg_calculate {
    
    
 public static void main(String[] args) {
    
     int Total_credit=15;	
        
	double English_1=3.50;
        double Math_1=4.00;
        double Physics_1=3.75;
        double Physics_1_Lab=3.50;
        double IP=3.50;
        double ICS=4.00;
        double IP_Lab=4.00;
        
        double TGP;
        
         
        TGP=((English_1*3)+( Math_1*3)+(Physics_1*3)+(Physics_1_Lab*1)+(IP*3)+(ICS*1)+(IP_Lab*1))/Total_credit;
        //ICS, IP lab, Physics Lab are 1 credit course
        
        System.out.println("MY First Semester CGPA is: "+ String.format("%.2f", TGP));
        
        
		
        
    }
    
}
