
package Bank_Account;

public class Bank_Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public void setAccountNumber(int an)
	{
      accountNumber=an;
	}
    public int getAccountNumber()
	{
     return accountNumber;
	}
    public void setAccountHolderName(String ahn)
	{
		accountHolderName=ahn;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setBalance(double b)
	{
		balance=b;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
      {
		  setBalance(getBalance() + amount);
		  System.out.println("Your "+ amount +" taka is successfully deposited!!");
		  System.out.println("Now your current balance is : "+getBalance()+" taka");
		  
      }
    public  void withdraw(double amount)
      {
		  if (amount > balance)
		  {
			  System.out.println("You are not able to withdraw your money!!");
		  }
		  else{
		  setBalance(getBalance() - amount);
		  System.out.println("Your "+ amount +" taka is successfully withdraw!!");
		  System.out.println("Now your current balance is : "+getBalance()+" taka");
		  }
      }
	public void showDetails()
	{
		System.out.println("Account number: "+getAccountNumber());
		System.out.println("Account Holder Name: "+getAccountHolderName());
		System.out.println("Account Balance: "+getBalance()+" taka");
	}
	
}