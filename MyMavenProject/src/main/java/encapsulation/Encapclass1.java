package encapsulation;

public class Encapclass1 
{
	private String username;
	private String password;
	
	public void setDetails(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public void getDetails() 
	{
		System.out.println("Username is "+username);
		System.out.println("Password is "+password);	
	}

}
