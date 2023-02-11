
package Bank_Account2;

public class Bank_Account2 {
    
    private int AccountNumber ;
    private String HolderName;
    private int Balance;
  
   
    
    
   
    
    public void setAccountNumber(int AccountNumber )
    {
        this.AccountNumber=AccountNumber;
    }
    public int getAccountNumber()
    {
        return AccountNumber;
    }
    
    public void setHoldername(String HolderName)
    {
        this.HolderName=HolderName;
    }
    
    public String getHolderName()
    {
        return HolderName;
    }
    
    public void setBalance(int Balance)
    {
        this.Balance=Balance;
    }
    
    public int getBalance()
    {
        return Balance;
    }
    
      public void deposit(int amount)
      {
           Balance=Balance+amount;
            System.out.println("Your "+ amount +" taka is successfully deposited!!");
            System.out.println("Now your current balance is : "+getBalance()+" taka");
      }
      
      public void withdraw(int amount)
      {
           if (amount > Balance)
		  {
			  System.out.println("You are not able to withdraw your money!!");
		  }
		  else{
		  Balance=Balance-amount;
		  System.out.println("Your "+ amount +" taka is successfully withdraw!!");
		  System.out.println("Now your current balance is : "+getBalance()+" taka");
		  }
      }
       
    
}
