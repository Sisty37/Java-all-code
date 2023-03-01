
package Inheritancee;

public class MainActivity {
     public static void main(String[] args) {
        
           FullTimeEmployee F1=new FullTimeEmployee(123, "ABC", 12000);       
        F1.showEmployeeInfo();
        F1.showFullTimeEmployeeInfo();
        
        PartTimeEmployee F2=new PartTimeEmployee(456, " DEF", 245);
        F2.showEmployeeInfo();
        F2.showPartTimeEmployeeInfo();
         
         
    }
}
