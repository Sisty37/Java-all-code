public class Book {
    
    
    String isbn;
    String bookTitle;
    String AuthorName;
    double price;
    int availableQuantity;
    
    
    Book()
    {
        System.out.println("Default"); 
    }
    
    Book(String isbn, String bookTitle, String AuthorName, double price, int availableQuantity){
        
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.AuthorName=AuthorName;
        this.price=price;
        this.availableQuantity=availableQuantity;
        
    }
	
	void showdata(){
		
        System.out.println("Isbn:" +isbn);
        System.out.println("Book title:" +bookTitle);
        System.out.println("Author Name: "+AuthorName);
        System.out.println("Price: "+price);
        System.out.println("Available Quantity: "+availableQuantity);
        
	}
    
	void addQuantity(int amount){
		availableQuantity=availableQuantity+amount;
	}
	
	void sellQuantity(int amount){
		availableQuantity=availableQuantity-amount;
	}
	
 
     public static void main(String[] args) {
        Book obj=new Book();
        
        Book obj1=new Book("QR","Think and glow", "zafor iqbal",200,1000);
	
		obj1.addQuantity(20);
		obj1.sellQuantity(5);
		obj1.showdata();
        
		
        
        
    }

    

}

