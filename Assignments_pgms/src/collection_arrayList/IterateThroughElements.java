package collection_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IterateThroughElements 
{
	//Method to insert elements into ArrayList
	public ArrayList <String> InsertElements(int no,Scanner s)
	{
		ArrayList<String> names=new ArrayList<String>();
		System.out.println("Enter the name of Students :");
		for(int i=0;i<no;i++)
		{
			String name =s.nextLine();
			names.add(name);
		}
		return names;
	}
	//Method to display elements of ArrayList
	public void IteratingElements(ArrayList<String> student)
	{
		//to print on next line -\n
		System.out.println("\nIterating elements using Iterator");
		Iterator <String> it=student.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\nIterating elements using for loop");
		for(int i=0;i<student.size();i++)
		{
			System.out.println(student.get(i));
		}
		
		System.out.println("\nIterating elements using for-each loop");
		for(String s:student)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) 
	{
		IterateThroughElements it=new IterateThroughElements();
		Scanner sc=new Scanner(System.in);
		ArrayList <String> students = new ArrayList <String>();
		System.out.println("Enter the No of Students :");
		int no=sc.nextInt();
		
		//Insert elements into ArrayList
		students=it.InsertElements(no, sc);
	
		//Iterating & displaying the methods
		it.IteratingElements(students);
		
		sc.close();
	}
}
