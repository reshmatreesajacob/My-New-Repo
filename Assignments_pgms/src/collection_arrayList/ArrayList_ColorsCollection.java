package collection_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ColorsCollection 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		// Create a new ArrayList to store colors
		ArrayList <String> colors=new ArrayList <String>();
		System.out.println("Enter the No of colors you want to add : ");
		int size=sc.nextInt();
		
		//for-each used to iterate for o/p only
		// Loop to get colors from the user and add to the list
		System.out.println("Enter the colors : ");
		for(int i=0;i<size;i++)
		{
			String color=sc.nextLine();
			colors.add(color);
		}
		
		// Use for-each loop to print out each color
		System.out.println("Colors in the ArrayList are : ");
		for(String s:colors)
		{
			System.out.println(s);
		}
		sc.close();
	}

}
