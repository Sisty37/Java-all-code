
package Assignment_3;

import Book3.Book3;

public class Start {
    
    public static void main(String[] args) {
        
        //Object create of Story Book class
       StoryBook obj1=new StoryBook("QR","Think and glow", "zafor iqbal",200,1000,"story");
        obj1.showdata();
         System.out.println(" ");
         System.out.println(" ");
        
        StoryBook obj2=new StoryBook();
    
          obj2.setIsbn("QR");
          System.out.println("Isbn : "+obj2.getIsbn());
                  
          obj2.setbookTitle("Think and glow");
          System.out.println("Book Title : "+obj2.getbookTitle());
           
          obj2.setAuthorName("zafar ");
          System.out.println("Author name : "+obj2.getAuthorName());
          
          obj2.setPrice(500);
          System.out.println("Price : "+obj2.getPrice());
          
          obj2.setcategory("story");
          System.out.println("Book Categoey:"+obj2.getcategory());
          
          obj2.setavaiableQuantity(2000);
          System.out.println("Avaiable Quantity : "+obj2.getavaiableQuantity());
          
         
          obj2.addQuantity(20);
                  
          obj2.sellQuantity(5);
          
          
          System.out.println(" ");
          System.out.println(" ");
          
         // object create of TextBook class
         
         TextBook obj3=new TextBook("QR","Think and glow", "zafor iqbal",200,1000, 11);
        obj1.showdata();
         System.out.println(" ");
         System.out.println(" ");
        
         TextBook obj4=new  TextBook();
    
          obj4.setIsbn("QR");
          System.out.println("Isbn : "+obj4.getIsbn());
                  
          obj4.setbookTitle("Think and glow");
          System.out.println("Book Title : "+obj4.getbookTitle());
           
          obj4.setAuthorName("zafar ");
          System.out.println("Author name : "+obj4.getAuthorName());
          
          obj4.setPrice(500);
          System.out.println("Price : "+obj4.getPrice());
          
          obj4.setstandard(111);
          System.out.println("Book Categoey:"+obj4.getstandard());
          
          obj4.setavaiableQuantity(2000);
          System.out.println("Avaiable Quantity : "+obj4.getavaiableQuantity());
          
         
          obj4.addQuantity(20);
                  
          obj4.sellQuantity(5);
          
          
    }
}
