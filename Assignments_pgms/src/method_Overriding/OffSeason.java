package method_Overriding;

import java.util.Scanner;

public class OffSeason extends OnSeason
{
	float disc;
	
	@Override
	public void calculateDiscount(float amount)
	{
		disc=0.15f;
		float price=amount;
		price=price-(price*disc);
		System.out.println("The final price is : " + price);
	}
	
	
	public static void main(String[] args) 
	{
		float price=0;
		Scanner sc=new Scanner(System.in);
		OnSeason on= new OnSeason();
		OffSeason of= new OffSeason();
		System.out.println("For Onseason press 1 For Offseason press 2");
		int s=sc.nextInt();
		System.out.println("Enter the amount : ");
		float am=sc.nextFloat();
		if(s==1)
		{
			on.calculateDiscount(am);
		}
		else
		{
			of.calculateDiscount(am);
		}
	}

}
