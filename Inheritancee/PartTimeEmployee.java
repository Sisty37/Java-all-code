

package Inheritancee;



public class PartTimeEmployee extends Employee{
    private int PaymentPerHour;
        
        PartTimeEmployee()
        {
            
        }
        PartTimeEmployee(int id, String name, int PaymentPerHour)
        {   
             super(id,name);
            this.PaymentPerHour=PaymentPerHour;
        }
        
        
        void setPaymentPerHour(int PaymentPerHour)
        {
            this.PaymentPerHour=PaymentPerHour;
        }
        
        int getPaymentPerHour()
        {
            return PaymentPerHour;
        }
        
        void showPartTimeEmployeeInfo()
        {
           
               System.out.println("Employee PaymentPerHour: "+getPaymentPerHour());
        }
        
    
    
}
