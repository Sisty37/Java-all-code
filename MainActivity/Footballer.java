public class Footballer extends Player {
	
	private int goalScore;	
	private double scoringAvg;
	private String totalNumMatches;
	
	Footballer()
	{
		
	}
	
	Footballer(int goalScore, double ScoringAvg, String totalNumMatches)
	{
		this.goalScore=goalScore;
		this.ScoringAvg= ScoringAvg;
		this.totalNumMatches=totalNumMatches;
	}
	
	void setFootballer(int goalScore, double ScoringAvg, String totalNumMatches)
	{
		this.goalScore=goalScore;
		this.ScoringAvg=ScoringAvg;
		this.totalNumMatches=totalNumMatches;
	}
	
	void showFootballerInfo()
	{
		super(name, age, country);
		System.out.println("Goal Score:"+goalScore);
		System.out.println("Avarege Score:"+ScoringAvg);
		System.out.println("Total number of match :"+totalNumMatches);
		
	}
	
	
	
	
	
	
	
}