package abstract_class;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		
		// Input type of employee
		System.out.println("Enter the type of Employee: Full-Time as 'F' & Part-Time as 'P'");
		char type=sc.next().charAt(0);
		
		// Fix: Consume the newline after the char input
        sc.nextLine();
        
        // Input employee name
		System.out.println("Enter your name ");	
		String name=sc.nextLine();
		
		// Input payment per hour
		System.out.println("Enter your payment per hour ");	
		int pay=sc.nextInt();
		
		// Switch case to handle Full-Time or Part-Time (Contractor)
		switch(type)
		{
		case 'F':
		case 'f':
			FullTimeEmployee fu=new FullTimeEmployee(name,pay);
			fu.CalculateSalary(8);
			break;
		case 'P':
		case 'p':
			System.out.println("Enter your working hours ");	
			int work=sc.nextInt();
			Contractor co=new Contractor(name,pay);
			co.CalculateSalary(work);
			break;
		}
		
		 // Close the scanner to avoid resource leaks
		sc.close();
	}
}
