package inheritance;

import java.util.Scanner;

//Class 1: Get basic pay, deduction, and bonus
public class Employee_Details 
{
	double basicPay;
	double deduction;
	double bonus;
	
	// Method to get input from the console
	public void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your basic pay");
		basicPay=sc.nextDouble();
		
		System.out.println("Enter your total deductions");
		deduction=sc.nextDouble();
		
		System.out.println("Enter your bonus");
		bonus=sc.nextDouble();
		
	}
}
