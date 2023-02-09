
package Bank_Account;


public class Test {
    public static void main(String[] args) {
        
        
        	Bank_Account b=new Bank_Account();
		System.out.println("=========Welcome to X bank==========");
		b.setAccountNumber(1491533);
		b.setAccountHolderName("Mr.X");
		b.setBalance(500);
		b.showDetails();
		System.out.println("");
        b.deposit(500);
		System.out.println("");
		b.withdraw(200);
		System.out.println("");
		System.out.println("Thank you for stay with us!!");
		System.out.println("====================================");
    }
    
}
