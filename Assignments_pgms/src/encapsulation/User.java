package encapsulation;

import java.util.Scanner;

public class User 
{
	float amount;
	
	public void WithdrawAmount(Scanner sm,Bank b)
	{
		if(b.validatePin())
		{
			System.out.println("Enter the amount : ");
			amount=sm.nextFloat();

		}
	}
		

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		User u=new User();
		Bank b= new Bank();
		System.out.println("Enter Pin : ");
		int pin=sc.nextInt();
		b.setPin(pin);
		//passing 2 class objects of Scanner & Bank
		u.WithdrawAmount(sc,b);

	}

}
