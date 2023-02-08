
package Constructor_Overloading;

public class Overloading_Constructor_Test {
    public static void main(String[] args) {
        
        Teacher teacher1=new Teacher();
        
        Teacher teacher2=new Teacher("sisty","male");
        teacher2.showdata();
        
       Teacher teacher3=new Teacher("jafar","male",957454);
       teacher3.showdata();
    }
    
}
