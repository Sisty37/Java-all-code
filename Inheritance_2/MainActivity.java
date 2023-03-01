
package Lab_task_5;

public class MainActivity {
    public static void main(String[] args) {
        
        	
		
	Footballer p1=new Footballer();
    p1.setplayerage(46);
    p1.setplayername("Ronaldo"); 
    p1.setplayercountry("Portugal");
    p1.showplayerInfo();
    p1.setFootballerInfo(10,9.9,"101");	
    p1.showFootballerInfo();	
		
		
    Cricketer p2=new Cricketer();
    p2.setplayerInfo("Sakib-Al-Hasan",35,"Bangladesh");
    p2.showplayerInfo();
    p2.setcricketerInfo("Batsman", "300");
    p2.showcricketerInfo(); 		
        
        
        
        
        
    }
    
}
