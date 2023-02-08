
package temperatureconverter;

//celsius to fahrenheit F=9C+32/5

import java.util.Scanner;

//fahrenheit to celsius c=5(F-32)/9

 
public class TemperatureConverter {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        
        double cels,farn;
        
        System.out.print("Enter any temp=");
        
        cels=input.nextDouble();
        
        farn=1.8*cels+32;
        
        System.out.println("Farenheit="+farn);
        
        
        
        
    
    }
    
}
