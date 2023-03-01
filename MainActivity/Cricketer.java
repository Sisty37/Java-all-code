public class Cricketer extends Player{
	
	private String playerType;
	private String totalNumMatches;
	
	
	Cricketer()
	{
		
	}
	
	Cricketer(String playerType, String totalNumMatches)
	{
		this.playerType=playerType;
		this.totalNumMatches=totalNumMatches;
	}
	
	void setcricketerInfo(String playerType, String totalNumMatches)
	{
		
		this.playerType=playerType;
		this.totalNumMatches=totalNumMatches;
	}
	
	void showcricketerInfo()
	{
		super(name, age, country);
		System.out.println("Player Type:"+playerType);
		System.out.println("Total num of matches:"+totalNumMatches);
		
	}
	
	
	
	
	
	
	
	
}