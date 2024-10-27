package super_keyword;

import java.util.Scanner;

public class CheckDivisibilityBy10 extends Addition
{
	float sum;
	
	public CheckDivisibilityBy10(float a,float b)
	{
		//to invoke parent class Constructor
		super(a,b);
		sum=0;	
	}
	
	public float getAdditionResult()
	{
		System.out.println("Fetching Addition Result........");
		return 0.0f;
	}
	
	public void IsDivisibleBy10()
	{
		getAdditionResult();
		// to invoke parent class method
		float s=super.getAdditionResult();
		System.out.println("Sum of numbers is : " +s);
		
		//to invoke parent class instance variable
		if(super.sum %10==0)
		{
			System.out.println("It is Divisible by 10");
		}
		else
		{
			System.out.println("It is not Divisible by 10");
		}
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to be added :  ");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		
		CheckDivisibilityBy10 ad=new CheckDivisibilityBy10(a,b);
		ad.IsDivisibleBy10();
		
		
	}

}
