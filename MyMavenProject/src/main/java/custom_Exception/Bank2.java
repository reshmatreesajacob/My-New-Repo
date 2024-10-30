package custom_Exception;

public class Bank2 
{
	public static void main(String[] args) 
	{
		int withdraw = 500,balance = 400;
		if(withdraw>balance)
		{
			try
			{
				//calling default constructor
				throw new MyExceptionClass();
			}
			catch(Exception e)
			{
				System.out.println("Exception Handling");
			}
		}
	}
}

