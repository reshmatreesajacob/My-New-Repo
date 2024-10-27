package encapsulation;

public class Bank 
{
	private int pin;
	
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	
	public boolean validatePin()
	{
		if(pin==1001 || pin ==1234 ||pin==1212)
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Pin");
			return false;
		}
	}
	
}
