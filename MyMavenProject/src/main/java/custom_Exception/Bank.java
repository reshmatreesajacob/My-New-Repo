package custom_Exception;

public class Bank 
{
	public static void main(String[] args) 
	{
		int withdraw = 500,balance = 400;
		if(withdraw>balance)
		{
			try
			{
				//calling parameterized constructor
				throw new MyExceptionClass("Insufficient Balance");
			}
			catch(Exception e)
			{
				System.out.println("Exception Handling");
			}
		}

	}

}
