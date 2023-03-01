
package Lab_task_5;


public class Player {
    
private  int age ;
private  String name;
private	 String country;
	
	public Player()
        {
            
        }
	public Player(int age, String name, String country)
	{
		 this.age =age;
		 this.name=name;
		 this.country=country;
	}
	
	public void setplayerage(int age)
	{
		this.age=age;
	}
	
	public int getplayerage()
	{
		return age;
	}
	
        public void setplayername(String name)
        {
            this.name=name;
        }
	
	public String getplayername()
	{
		return name;
	}
	
        public void setplayercountry(String country)
        {
            this.country=country;
        }
	
	public String getplayercountry()
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
