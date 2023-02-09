
package attributes;


public class Attributes {

   int accountNumber =101;
   
   String accountHolderName="sisty";
   double balance=10000;
   
   
   void setaccountNumber(int an )
   {
       accountNumber=an;
       
   }
     void setaccountHolderName(String ahn )
   {
       accountHolderName=ahn;
       
   }
     
      void setbalance(int bel )
   {
       balance=bel;
       
   }
      
      void getaccountNumber()
      {
          System.out.println("Account number:"+accountNumber);
      }
      
       void setaccountHolderName()
      {
          System.out.println("Account Holder name:"+accountHolderName);
      }
       void getbalance( )
   {
      
       System.out.println("Balance:"+balance);
   }  

    void getaccountHolderName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
       
       
       
      
      
    
     
        
        
        
    
    
}
