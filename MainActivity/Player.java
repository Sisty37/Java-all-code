public class Player{
	
	private int age ;
	private String name;
	private String country;
	
	public Player(){}
	public Player(int age, String name, String country)
	{
		 this.age =age;
		 this.name=name;
		 this.country=country;
	}
	
	void setplayerage(int age)
	{
		this.age=age;
	}
	
	int getplayerage()
	{
		return age;
	}
	
	void setplayerage(String name)
	{
		this.name=name;
	}
	
	String getplayername()
	{
		return name;
	}
	
	void setplayerage(String country)
	{
		this.country=country;
	}
	
	String getplayercountry()
	{
		return country;
	}
	
	void setplayerInfo(String name, int age , String country)
	{
		 this.name=name;
		 this.age =age;
		 this.country=country;
	}
	
	void showplayerInfo()
	{
		System.out.println("player name:"+name);
		System.out.println("player age:"+age);
		System.out.println("player country:"+country);
	}
	
	
	
	
	
	
}