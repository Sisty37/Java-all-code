
package Inheritancee;


public class FullTimeEmployee extends Employee {
    
     private int salary;
        
        
        FullTimeEmployee()
        {
            
        }
        
         FullTimeEmployee(int id, String name, int salary)
        {
            super(id,name);
           this.salary=salary;
           
        }
        
         void showFullTimeEmployeeInfo()
         {
          
             System.out.println("Employee salary: "+salary);
         }
        
    
    
}
