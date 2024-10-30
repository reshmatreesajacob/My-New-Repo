package exception;

public class ThrowThrowsSample 
{
	public void print02()
	{
		try
		{
			print01();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handling");
		}	
	}
	
	public void print01() throws ArithmeticException
	{
		int c=100/0;
		System.out.println(c);
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) 
	{
		ThrowThrowsSample sp=new ThrowThrowsSample();
		sp.print02();
	}
}
