package methods;

import java.util.Scanner;

public class Static_Palindrome {
	
	public static int Reverse(int x)
	{
		int i=x;
		int r=0;
		int sum=0;
		while(i!=0)
		{
			r=i%10;          
			sum=(sum*10)+r;  
			i=i/10;
		}
		return(sum);
	}
	
	public static void Palindrome(int no)
	{
		int rev=Reverse(no);
		if(no==rev)
		{
			System.out.println("No is Palindrome");
		}
		else
		{
			System.out.println("No is Not Palindrome");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char s='y';
		while((s=='Y')||(s=='y'))
		{
			System.out.println("Enter the no : ");
			int no=sc.nextInt();
			Palindrome(no);
			System.out.println("Do you want to check another no: (Y/N) ");
			s=sc.next().charAt(0);
		}
		sc.close();
	}
}
