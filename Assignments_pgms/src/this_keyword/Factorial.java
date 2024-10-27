package this_keyword;

import java.util.Scanner;

public class Factorial 
{
	int num;
	
	public int fact(int num)
	{
		this.num=num;
		int fa=1;
		if(num==0)
		{
			return fa;
		}
		else
		{
		  for(int i=1;i<=num;i++) 
		  {
			 fa=fa*i;
		  }
			return fa;
		}
	}
		
		
	public void Print(int n)
	{
		int fac=this.fact(n);
		System.out.println("Factorial of "+n+" is "+fac);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Factorial f=new Factorial();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		f.Print(n);
		sc.close();
	}

}
