package aggregation;

import java.util.Scanner;

public class Address 
{
	String city;
	String state;
	String country;
	Student stud;
	
	public Address(String city,String state,
			String country,Student stud)
	{
		this.city=city;
		this.state=state;
		this.country=country;
		this.stud=stud;
	}
	
	public void printDetails()
	{
		System.out.println("Roll No is "+stud.rollNo);
		System.out.println("Name is "+stud.name);
		System.out.println("City is "+city);
		System.out.println("State is "+state);
		System.out.println("Country is "+country);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Roll No :");
		int rollNo=sc.nextInt();
		sc.nextLine();// Consumes the leftover newline character
		System.out.println("Enter Name :");
		String name=sc.nextLine();
		System.out.println("Enter City :");
		String city=sc.nextLine();
		System.out.println("Enter State :");
		String state=sc.nextLine();
		System.out.println("Enter Country :");
		String country=sc.nextLine();
		
		Student st=new Student(name,rollNo);
		Address ad=new Address(city,state,country,st);
		
		ad.printDetails();
		sc.close();
	}
}
