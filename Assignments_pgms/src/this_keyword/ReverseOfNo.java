package this_keyword;

import java.util.Scanner;

public class ReverseOfNo 
{
	int num;
	int rev;
	
	public ReverseOfNo(int num,int rev)
	{
		this.num=num;
		this.rev=rev;
		while(num!=0)
		  { 
		    int d=num%10;  
		    rev= rev*10+d;
		    num=num/10;
		  }
		new ReverseOfNo(rev);
		
	}
	
	public ReverseOfNo(int rev)
	{
		System.out.println("Finding Reverse .........");
		System.out.println("Reverse is "+rev);
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		ReverseOfNo r=new ReverseOfNo(n,0);
		sc.close();
	}
}
