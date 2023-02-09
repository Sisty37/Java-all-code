
package Book;


public class start {
    public static void main(String[] args) {
        Book obj=new Book();
        
        Book obj1=new Book("QR","Think and glow", "zafor iqbal",200,1000);
	
		obj1.addQuantity(20);
		obj1.sellQuantity(5);
		obj1.showdata();
        
        
        
    }
    
}
