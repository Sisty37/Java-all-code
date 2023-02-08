
package Static_Block;


public class StaticBlock {
    
    static int id;
    static String name;
   
    //static Block
    static{
        
        id=101;
        name="sisty";
        
        }
    
   static void display(){
        
        System.out.println("ID:"+id);
        System.out.println("Namwe:"+name);
    }
    
}
