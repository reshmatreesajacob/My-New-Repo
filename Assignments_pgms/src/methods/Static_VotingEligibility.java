package methods;

import java.util.Scanner;

public class Static_VotingEligibility {
	
	public static boolean IsEligible(int a)
	{
		/* 
		 * return age >= 18; // Returns true if age is 18 or older
		 OR  
		 */
		
		if(a>=18)
		{
			return true;
		}
		else
		{
			return false;

		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char choice='y';
		while((choice=='y')||(choice=='Y'))
		{
			System.out.println("Enter your age : ");
			int age=sc.nextInt();
			boolean s=IsEligible(age);
			if(s)
			{
				System.out.println("You are Eligible for Voting");
			}
			else
			{
				System.out.println("You are Not Eligible for Voting");
			}
			System.out.println("Do you want to check another age : (Y/N)");
			choice=sc.next().charAt(0);
    	}
		sc.close();
	}
 }

