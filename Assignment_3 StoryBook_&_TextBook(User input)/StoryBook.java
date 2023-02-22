
package Assignment_3;




public class StoryBook {
    

     
   private String isbn;
    private String bookTitle;
    private String AuthorName;
    private double price;
    private int availableQuantity;
    private String category;
   private  static double discountRate;
    
    
    StoryBook()
    {
        System.out.println("Default"); 
    }
    
    //Constructor
    
    StoryBook(String isbn, String bookTitle, String AuthorName, double price, int availableQuantity, String category)
     
     {
        
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.AuthorName=AuthorName;
        this.price=price;
        this.category=category;
        this.availableQuantity=availableQuantity;
        
     }


   void showdata()     
   {
        System.out.println("Isbn:" +isbn);
        System.out.println("Book title:" +bookTitle);
        System.out.println("Author Name: "+AuthorName);
        System.out.println("Price: "+price);
        System.out.println("Book category:"+category);
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
    
    int  getavaiableQuantity()
    {
        return availableQuantity;
    }
    
    void setcategory(String category)
    {
        this.category=category;
    }
    String getcategory()
    {
        return category;
    }
    
    
    
    
    void addQuantity(int amount){
		availableQuantity=availableQuantity+amount;
                 System.out.println("After adding book quantity:"+availableQuantity);
	}
    
    
    
   
	
	void sellQuantity(int amount)
        {
		availableQuantity=availableQuantity-amount;
                System.out.println("After selling book quantity:"+availableQuantity);
	}
     
    
}
