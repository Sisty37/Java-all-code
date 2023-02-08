
package string_1;


public class String_1 {

    public static void main(String[] args) {
       
        String s1="sisty";
        String s2="sisty";
        
        
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        
        
        boolean con =s1.contains("karim");
        
        System.out.println(con);
        
       boolean con2 =s1.contains("sisty");
        System.out.println(con2);
        
        int len=s1.length();
        
        System.out.println("Length of s1="+len);
        
        if(s1.equals(s2))
            System.out.println("Equal");
        
        else
            System.out.println(" not equal");
        
        
                
    }
    
}
