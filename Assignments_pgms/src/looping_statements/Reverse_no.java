package looping_statements;

import java.util.Scanner;

public class Reverse_no 
{
	 public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no to be reversed");
	  int ab=sc.nextInt();
	  int rev=0;
	  int rem=0;
	  while(ab!=0)
	  { 
	    rem=ab%10;  
	    rev= rev*10+rem;
	    ab=ab/10;
	  }
	  System.out.println(rev);
	}
}

