
package Book2;

public class Book2 {
    
    String isbn;
    String bookTitle;
    String AuthorName;
    double price;
    int availableQuantity;
    
    
    Book2()
    {
        System.out.println("Default"); 
    }
    
    //Constructor
    
     Book2(String isbn, String bookTitle, String AuthorName, double price, int availableQuantity)
     
     {
        
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.AuthorName=AuthorName;
        this.price=price;
        this.availableQuantity=availableQuantity;
      	
        System.out.println("Isbn:" +isbn);
        System.out.println("Book title:" +bookTitle);
        System.out.println("Author Name: "+AuthorName);
        System.out.println("Price: "+price);
        System.out.println("Available Quantity: "+availableQuantity);
     }
        
	
    
   
    void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }   
    
    void getIsbn()
    {
        System.out.println("Isbn:"+isbn); 
    }
    
    void setbookTitle(String bookTitle)
    {
       this.bookTitle=bookTitle;
    }
    
    String getbookTitle ()
    {
        return bookTitle; 
    }     
    
    void setAuthorName(String AuthorName)
    {
       this.AuthorName=AuthorName; 
    }
    
    void getAuthorName ()
    {
        System.out.println("Author Name:"+AuthorName); 
    }
      
    void setPrice(double price)
    {
       this.price=price; 
    }
    
    void getPrice()
    {
        System.out.println("Price:"+price);
    }
    
    void setavaiableQuantity(int availableQuantity)
    {
      this.availableQuantity=availableQuantity;
     
    }
    
    void  getavaiableQuantity()
    {
        System.out.println("Avaiable Quantity:"+availableQuantity);
    }
    
    
    void addQuantity(int amount){
		availableQuantity=availableQuantity+amount;
                 System.out.println("After adding book:"+availableQuantity);
	}
    
    
    
   
	
	void sellQuantity(int amount){
		availableQuantity=availableQuantity-amount;
                System.out.println("After selling:"+availableQuantity);
	}
    
    
    
    
    
}
