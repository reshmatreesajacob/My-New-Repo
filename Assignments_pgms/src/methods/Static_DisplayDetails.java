package methods;

import java.util.Scanner;

public class Static_DisplayDetails {
	
	public static void display(String s,int a)
	{
		String name=s;
		int age=a;
		System.out.println("Name is : "+name+ "\n"+ "Age is :"+age);
		
	}

	public static void main(String[] args) 
	{
		Static_DisplayDetails sd=new Static_DisplayDetails();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name & Age :" );
		String name=sc.next();
		int age=sc.nextInt();
		display(name, age);
		sc.close();

	}

}
