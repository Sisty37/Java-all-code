
package string_3;

public class String_3 {

  
    public static void main(String[] args) {
      
        String country = "Bangladesh is my country is";
        System.out.println(country);
        
        char ch =country.charAt(0);
        System.out.println("ch="+ch);
        
        int value = country.codePointAt(0);
        System.out.println("Asci value of B="+value);
        
        
        int pos = country.indexOf("is");
        System.out.println("First position of is="+pos);
        
        pos=country.lastIndexOf("is");
        System.out.println("Last position of is ="+pos);
        
        //Replace
        
        String s1="This is my country";
        
        String s2=s1.replace('i', 'j');
        System.out.println("i replace by j :"+s2);
        
        
     
    }
    
}
