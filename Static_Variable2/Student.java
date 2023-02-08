
package Static_Variable2;


public class Student {
    
    static int count=0;
    
    Student(){
        count++;
    }
    
    void TotalStudent(){
        
        System.out.println("Total Student="+count);
    }
}
