
package Inheritancee;


public class Employee {
    int id;
    String name;
    
    Employee()
    {
        
    }
    
     Employee(int id, String name)
     {
         this.id=id;
         this.name=name;
     }
    
     void setEmployeeId(int id)
     {
         this.id=id;
     }
    
     
     void setEmployeeName(String name)
     {
         this.name=name;
     }
     
     int getEmployeeId()
     {
         return  id;
     }
     
     
     String getEmployeename()
     {
         return  name;
     }
     
    void showEmployeeInfo()
    {
        System.out.println("Employee id: "+getEmployeeId());
        System.out.println("Employee name:"+getEmployeename());
        
        
    }
}
