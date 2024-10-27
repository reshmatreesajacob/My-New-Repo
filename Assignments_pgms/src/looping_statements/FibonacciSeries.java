package looping_statements;

public class FibonacciSeries {
	
	public static void main(String args[])
	{
	 int a=0;
	 int b=1;
	 int s;
	 for(int i=0;i<7;i++)
	{ 
	 System.out.println(a);
	 s=a+b;
	 a=b;
	 b=s;

	} 
	}

}
