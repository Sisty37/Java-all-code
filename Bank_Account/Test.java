
package Bank_Account2;


public class Test {
    public static void main(String[] args) {
        
        System.out.println("========= Welcome to Islami Bank ========");
        Bank_Account2 obj=new Bank_Account2();
        
	obj.setAccountNumber(123456);
        System.out.println("Account Number : "+obj.getAccountNumber());
        
        obj.setHoldername("sisty");
        System.out.println("Account Holder name : "+obj.getHolderName());
        
        obj.setBalance(1000);
        System.out.println("Your Previous Balance : "+obj.getBalance());
        
        
        System.out.println(" ");
        
        obj.deposit(500);
        
	System.out.println("");
        
	obj.withdraw(200);
        
	System.out.println(" ");
        
	System.out.println("Thank you for stay with us!!");
	System.out.println("====================================");
		
        
        
        
    }
}
