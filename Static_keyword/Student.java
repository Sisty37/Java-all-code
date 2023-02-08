
package Static_keyword;


public class Student {
    
    String name;
    int Id;
   static String universityname="Aiub";
   
   Student(String nam, int Idd){
       
       name=nam;
       Id=Idd;
       
   }
   
   void display(){
       
       System.out.println("Name:"+name);
       System.out.println("Id:"+Id);
       System.out.println("University name:"+universityname);
   }
    
}
