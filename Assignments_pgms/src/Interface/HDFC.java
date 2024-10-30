package Interface;

import java.util.Scanner;

public class HDFC implements RBI 
{
	@Override
	public void recurringDeposit(double amount,
			int duration,String interestType) 
	{
		if(interestType.equalsIgnoreCase("Simple"))
		{
			double si=amount + (amount *interestRate* duration / 100);
			System.out.println("Maturity amount is "+si);
		}
		else if(interestType.equalsIgnoreCase("Compund"))
		{
			double ci=amount * Math.pow((1 + interestRate / 100), duration);
			System.out.println("Maturity amount is "+ci);
		}
		else
		{
			System.out.println("Invalid Option");
		}	
	}
	
	public static void main(String[] args) 
	{
		RBI r=new HDFC();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Interest Type :");
		System.out.println("Simple for Simple Interest &"
				+ "Compund for Compound Interest");
		String interestType=sc.nextLine();
		System.out.println("Enter the Deposit Amount");
		Double amount=sc.nextDouble();
		System.out.println("Enter the duration ");
		int duration=sc.nextInt();
		
		r.recurringDeposit(amount, duration, interestType);
	}
}
