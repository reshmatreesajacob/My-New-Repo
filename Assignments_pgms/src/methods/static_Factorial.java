package methods;

import java.util.Scanner;

public class static_Factorial {
	
	public static void Factorial(int x)
	{
		int fac=1;
		if(x==0)
		{
			System.out.println("Factorial of 0 is 1");
		}
		else
		{
		  for(int i=1;i<=x;i++) 
		  {
			 fac=fac*i;
		  }
			System.out.println("Factorial of " + x + " is " +fac);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no=sc.nextInt();
		Factorial(no);
	}
}
