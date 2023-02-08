
package Static_Method;


public class StaticMethod {
    
   
    
    //non static method
    void display1(){
        display2();
        System.out.println("I am non static method");
    }
    
    // static method
    static void display2(){
        
        System.out.println("I am static method");
    }
}
