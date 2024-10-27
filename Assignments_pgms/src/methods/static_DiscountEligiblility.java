package methods;

import java.util.Scanner;

public class static_DiscountEligiblility 
{
	public static double total_Amt(int item[])
	{
		double t=0.0f;
		for(int i=0;i<5;i++)
		{
			t=t+item[i];
		}
		System.out.println("Total amount is : "+t);
		return t;	
	}
	
	public static double discount(double total)
	{
		double d=0.0f;
		if(total>5000)
		{
			System.out.println("You are eligible for a discount of 20%");
			d=(total*0.2);
			total=total-d;
			return total;
		}
		else
		{
			System.out.println("No discount");
			return total;
		}
	}

	public static void main(String[] args) 
	{
		int item[]=new int[5];
		Scanner sc=new Scanner(System.in);
		static_DiscountEligiblility st=new static_DiscountEligiblility();
		System.out.println("Enter the item price");
		for(int i=0;i<5;i++)
		{
			item[i]=sc.nextInt();
		}
		double totalAmt=st.total_Amt(item);
		double dis=st.discount(totalAmt);
		System.out.println("amount to be paid aftyer discount is "+dis);
	}

}
