
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
      
      
      
      
      int getaccountNumber()
      {
        return accountNumber;
      }
      
       String setaccountHolderName()
      {
           return accountHolderName;
      }
      double getbalance( )
   {
      
        return balance;
   }  

      

     void showdata()  
     {
         System.out.println("Account number:"+accountNumber);
         System.out.println("Account Holder name:"+accountHolderName);
         System.out.println("Balance:"+balance);
         
     }
    
        
    
    
}
