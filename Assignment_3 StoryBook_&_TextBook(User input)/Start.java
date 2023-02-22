
package Assignment_3;

import java.util.Scanner;

public class Start {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        
        //Object create of Story Book class
       
       
        
        System.out.println("Enter details for Storybook :");
        
        System.out.print("Enter isbn: ");
        String isb=input.next();
        
        System.out.print("Enter Book Title: ");
        String bookTit=input.next();
        
        System.out.print("Enter Author name: ");
        String Autname =input.next();
        
        System.out.print("Enter Book price: ");
        int pric =input.nextInt();
        
        System.out.print("Enter Book Quantity: ");
        int avaiQuant =input.nextInt();
        
        System.out.print("Enter Book category: ");
        String cat =input.next();
       
        //Default constructor
       StoryBook obj1=new StoryBook();
       
       StoryBook obj2=new StoryBook(isb, bookTit, Autname,pric,avaiQuant,cat);
       obj2.showdata();
         System.out.println(" ");
         System.out.println(" ");
        
        
        System.out.println("Enter details for Story Book:");
        
        System.out.print("Enter ISBN: ");
        obj2.setIsbn(input.next());
        
        System.out.print("Enter book title: ");       
        obj2.setbookTitle(input.next());
        
        System.out.print("Enter Book Author name: ");
        obj2.setAuthorName(input.next());
        
        System.out.print("Enter Discount rate: ");        
        StoryBook.setDiscountRate(input.nextInt());
        
        System.out.print("Enter Price: ");
        obj2.setPrice(input.nextInt());
        
        System.out.print("Enter book category: ");
        obj2.setcategory(input.next());
        
        System.out.print("Enter Available Quantity: ");
        obj2.setavaiableQuantity(input.nextInt());
        
        
        System.out.print("Enter Add Quantity: ");
        
          
        System.out.print("Enter sell Quantity: ");       
       
        
        
         
        System.out.println("ISBN : "+obj2.getIsbn());
          
        System.out.println("Book Title : "+obj2.getbookTitle());
        
        System.out.println("Author name : "+obj2.getAuthorName());
          
        System.out.println("Discount Rate :"+StoryBook.getDiscountRate());
         
        System.out.println("Price : "+obj2.getPrice());
 
        System.out.println("Book Categoey:"+obj2.getcategory());
          
        System.out.println("Avaiable Quantity : "+obj2.getavaiableQuantity());
        
        obj2.addQuantity(input.nextInt());
          
        obj2.sellQuantity(input.nextInt()); 
        
        
        System.out.println(" ");
          
        // object create of TextBook class
         
        System.out.println("Enter details for Textbook :");
        
        System.out.println("Enter isbn: ");
        String isbb=input.next();
        
        System.out.println("Enter Book Title: ");
        String bookTitt=input.next();
        
        System.out.println("Enter Author name: ");
        String Authname =input.next();
        
        System.out.println("Enter Book price: ");
        int pricc =input.nextInt();
        
        System.out.println("Enter Book Quantity: ");
        int AvaiQuanti =input.nextInt();
        
        System.out.println("Enter Book Standard: ");
        String catt =input.next();
         
        //Default constructor
         TextBook obj3=new  TextBook();
         
         TextBook obj4=new TextBook(isbb,bookTitt, Authname,pricc,AvaiQuanti, catt);
        obj4.showdata();
        
        
      
         System.out.println(" ");
         
        System.out.println("Enter details for Textbook :"); 
         
        System.out.println("Enter isbn: ");        
        obj4.setIsbn(input.nextLine());
          
          
        System.out.println("Enter Book Title: ");
        obj4.setbookTitle(input.next());
          
        System.out.println("Enter Author name: "); 
        obj4.setAuthorName(input.next());
          
        System.out.println("Enter Discount rate: ");
        TextBook.setDiscountRate(input.nextInt());
          
        System.out.println("Enter Price: ");
        obj4.setPrice(input.nextInt());
          
       System.out.println("Enter Standard: ");
        obj4.setstandard(input.next());
          
        System.out.println("Enter Avaiable Quantity: ");
        obj4.setavaiableQuantity(input.nextInt());
        
        System.out.println("Enter Add Quantity: ");
        System.out.println("Enter sell Quantity: ");
          
        System.out.println("Isbn : "+obj4.getIsbn());
        
        System.out.println("Book Title : "+obj4.getbookTitle());
         
        System.out.println("Author name : "+obj4.getAuthorName());
          
        System.out.println("Discount Rate:"+TextBook.getDiscountRate());
          
        System.out.println("Price : "+obj4.getPrice());
          
        System.out.println("Book Categoey:"+obj4.getstandard());
         
        System.out.println("Avaiable Quantity : "+obj4.getavaiableQuantity());
          
      
        obj4.addQuantity(input.nextInt());
          
       
        obj4.sellQuantity(input.nextInt());
          
          
    }
}
