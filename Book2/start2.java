
package Book2;


public class start2 {
    public static void main(String[] args) {
        
        
        //1st object
        Book2 obj1=new Book2("QR","Think and glow", "zafor iqbal",200,1000);
        
        System.out.println(" ");
        System.out.println(">>>>>>>>>>>>>>>>> ");
        System.out.println("................. ");
        System.out.println(">>>>>>>>>>>>>>>>>");
        System.out.println(" ");
        //2nd object
          Book2 obj2=new Book2();
          
          obj2.setIsbn("QR");
          obj2.getIsbn();
                  
          obj2.setbookTitle("think and glow");
          System.out.println(obj2.getbookTitle());
           
          obj2.setAuthorName("zafor iqbal");
          obj2.getAuthorName();
          
          obj2.setPrice(500);
          obj2.getPrice();
          
          obj2.setavaiableQuantity(2000);
          obj2.getavaiableQuantity();
          
          obj2.addQuantity(20);
                  
          obj2.sellQuantity(5);
          
          
       
    }
    
}
