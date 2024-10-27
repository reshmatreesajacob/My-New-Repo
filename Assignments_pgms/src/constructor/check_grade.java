package constructor;

import java.util.Scanner;

public class check_grade 
{
	int marks[]=new int[3];
	int total=0;
	
	// Constructor to get marks and initialize it with the input values
	public check_grade(Scanner sc)
	{
		// to get marks and initialize it with that values
		System.out.println("Enter the marks of 3 subjects out of 100 ");
		for(int i=0;i<3;i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	
	public int total_marks() 
	{
		for(int i=0;i<3;i++)
		{
			total=total+marks[i];
		}
		return total;
	}
	
	public void grade_check(int t) 
	{
		float a=((t/300.0f)*100);
		System.out.println("Total Marks: " + t);
        System.out.println("Percentage: " + a);
        
		 if(a<40)
			{
			 System.out.println("Failed");
			}
		else if((a>=40)&&(a<=60))
			{
			 System.out.println("Grade D");
			}
		else if((a>=61)&&(a<=70))
			{
			 System.out.println("Grade C");
			}
		else if((a>=71)&&(a<=80))
			{
			 System.out.println("Grade B");
			}
		else if((a>=81)&&(a<=100))
			{
			 System.out.println("Grade A");
			}
		else
			{
			 System.out.println("Invalid Mark");

			}
	}
	
	

	public static void main (String[] args) 
	{
		// Create a single Scanner instance
		Scanner sm=new Scanner(System.in);
		int t;
		
		
		//1st student
		check_grade st1=new check_grade(sm);
		t=st1.total_marks();
		st1.grade_check(t);
		
		//2nd student
		check_grade st2=new check_grade(sm);
		t=st2.total_marks();
		st2.grade_check(t);
		
		sm.close();
	}

}
