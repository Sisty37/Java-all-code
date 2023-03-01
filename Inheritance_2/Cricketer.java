
package Lab_task_5;


public class Cricketer extends Player{
	
	private String playerType;
	private String totalNumMatches;
	
	
	public Cricketer()
	{
		
	}
	
	public Cricketer(String playerType, String totalNumMatches)
	{
            
         
		this.playerType=playerType;
		this.totalNumMatches=totalNumMatches;
	}
	
	public void setcricketerInfo(String pType, String tMatch)
	{
		
		playerType=pType;
		totalNumMatches=tMatch;
	}
	
	public void showcricketerInfo()
	{
	        super.getplayername();
                super.getplayerage();
                super.getplayercountry();
		System.out.println("Player Type:"+playerType);
		System.out.println("Total num of matches:"+totalNumMatches);
		
	}
	
	
	
	
}
