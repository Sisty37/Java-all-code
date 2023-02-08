package array_list_1;

import java.util.ArrayList;

public class Array_List_1 {

    
    public static void main(String[] args) {
       
        ArrayList<Integer> number =new ArrayList<>();
        
        System.out.println("size="+number.size());
       //Adding Elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,5);
        
       System.out.println(number);
        
        for (int x: number) {
            
            System.out.print(" "+x);
            
        }
        
        System.out.println();
        
        System.out.println("size="+number.size());
        
        //Removing Elements
        
        number.remove(2);
        System.out.println("After removing array list:"+number);
        
        //removing all elements
        
        number.removeAll(number);
        
        System.out.println("After removing all:"+number);
          
        
        
        
    }
    
}
