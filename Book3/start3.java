
package Book3;


public class start3 {
    public static void main(String[] args) {
        
        
      //1st object
      System.out.println("<><><><> Welcome to read my Book <><><><>");
        System.out.println(" ");
        Book3 obj1=new Book3("QR","Think and glow", "zafor iqbal",200,1000);
        
        System.out.println(" ");
        System.out.println(">>>>>>>>>>>>>>>>> ");
        System.out.println(".................. ");
        System.out.println(".................. ");  
        System.out.println("<<<<<<<<<<<<<<<<<");
        System.out.println(" ");
        
        
        //2nd object
        System.out.println("<><><><> Welcome to read my Book <><><><>");
        System.out.println(" ");
        
          Book3 obj2=new Book3();
          
          obj2.setIsbn("QR");
          System.out.println("Isbn : "+obj2.getIsbn());
                  
          obj2.setbookTitle("Think and glow");
          System.out.println("Book Title : "+obj2.getbookTitle());
           
          obj2.setAuthorName("zafar ");
          System.out.println("Author name : "+obj2.getAuthorName());
          
          obj2.setPrice(500);
          System.out.println("Price : "+obj2.getPrice());
          
          obj2.setavaiableQuantity(2000);
          System.out.println("Avaiable Quantity : "+obj2.getavaiableQuantity());
          
          obj2.addQuantity(20);
                  
          obj2.sellQuantity(5);
          
         System.out.println(" "); 
        System.out.println("Thank you for stay with us!");
        System.out.println("===========================");
    }
    
}
