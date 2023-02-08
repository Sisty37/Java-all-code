
package Constructor_Overloading;

public class Teacher {
    
    String name, gender;
    int phone;
  
    Teacher()
    { 
        System.out.println("Default Constructor");
    }
    
    
    Teacher(String nam, String gen)
    { 
        name=nam;
        gender=gen;
        
    }
    
    Teacher(String nam, String gen, int ph)
    { 
        name=nam;
        gender=gen;
        phone=ph;       
    }
    
    void showdata()
    {
        System.out.println("Name:"+name);
         System.out.println("Gender:"+gender);
          System.out.println("Phone:"+phone);
          System.out.println(" ");
    }
}
