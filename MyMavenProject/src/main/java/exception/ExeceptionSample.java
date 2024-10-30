package exception;

public class ExeceptionSample 
{

	public static void main(String[] args) 
	{
		int a=2,b=46;
		try
		{
			int c=100/0;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handling");
		}
		finally
		{
			System.out.println("Fianlly Block");
		}
		int s=a+b;
		System.out.println(s);
	}
}
