
package Assignment_3;




public class TextBook {
   
    
     String isbn;
    String bookTitle;
    String AuthorName;
    double price;
    int availableQuantity;
    String standard;
    static double discountRate;
    
    
    TextBook()
    {
        System.out.println("Default"); 
    }
    
    //Constructor
    
     TextBook(String isbn, String bookTitle, String AuthorName, double price, int availableQuantity, String standard)
     
     {
        
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.AuthorName=AuthorName;
        this.price=price;
        this.standard=standard;
        this.availableQuantity=availableQuantity;
        
     }


   void showdata()     
   {
        System.out.println("Isbn:" +isbn);
        System.out.println("Book title:" +bookTitle);
        System.out.println("Author Name: "+AuthorName);
        System.out.println("Price: "+price);
        System.out.println("Book Standard:"+standard);
        System.out.println("Available Quantity: "+availableQuantity);
     }
        
	
    static void setDiscountRate(double rate){
           discountRate=rate;
    }
    static double getDiscountRate( ){
        return discountRate;
    }

    
    void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }   
    
    String getIsbn()
    {
        return isbn;
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
    
    String getAuthorName ()
    {
        return AuthorName; 
    }
      
    void setPrice(double price)
    {
        this.price=price-(price*40/100);
    }
    
    double getPrice()
    {
        return price;
    }
    
    void setavaiableQuantity(int availableQuantity)
    {
      this.availableQuantity=availableQuantity;
     
    }
    
    void setstandard(String standard)
    {
        this.standard=standard ;
    }
    String getstandard()
    {
        return standard;
    }
    
    int  getavaiableQuantity()
    {
        return availableQuantity;
    }
    
    
    void addQuantity(int amount){
		availableQuantity=availableQuantity+amount;
                 System.out.println("After adding book:"+availableQuantity);
	}
    
    
    
   
	
	void sellQuantity(int amount)
        {
		availableQuantity=availableQuantity-amount;
                System.out.println("After selling:"+availableQuantity);
	}
    
     

}