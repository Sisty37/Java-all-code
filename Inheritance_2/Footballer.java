
package Lab_task_5;

public class Footballer extends Player {
	
	private int goalScore;	
	private double scoringAvg;
	private String totalNumMatches;
	
	public Footballer()
	{
		
	}
	
	public Footballer(int goalScore, double ScoringAvg, String totalNumMatches)
	{
               super.getplayername();
               super.getplayerage();
               super.getplayercountry();
		this.goalScore=goalScore;
		this.scoringAvg= ScoringAvg;
		this.totalNumMatches=totalNumMatches;
	}
	
        
        
	public void setFootballerInfo(int goalScore, double ScoringAvg, String totalNumMatches)
	{
              
		this.goalScore=goalScore;
		this.scoringAvg=ScoringAvg;
		this.totalNumMatches=totalNumMatches;
	}
	
	public void showFootballerInfo()
	{
		
		System.out.println("Goal Score:"+goalScore);
		System.out.println("Avarege Score:"+scoringAvg);
		System.out.println("Total number of match :"+totalNumMatches);
		
	}
	
	
	
	
	
	
	
}