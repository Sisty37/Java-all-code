
package two_dimensional_array;


public class Two_dimensional_Array {

    
    public static void main(String[] args) {
       
        int [][] number= new int[2][3];
        
        number[0][0]=45;
        number[0][1]=20;
        number[0][2]=34;
        number[1][0]=98;
        number[1][1]=50;
        number[1][2]=23;
        //matrix hbe 1,1 thake start hoy but array 1,1 er jaygai 0,0 thake start hbe 
        /*
         [0][0]  [0][1]  [0][2]  
           45     20      34
         [1][0]  [1][1]  [1][2]
           98     50      23
        */
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                System.out.print(" "+number[row][col]);
                
            }
            System.out.println(" ");
            
        }
        
     
    }
    
}
