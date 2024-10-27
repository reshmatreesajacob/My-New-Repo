package collection_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SearchElement
{
	public static boolean Search(ArrayList<String> state,String n)
	{
		String element=n.toLowerCase();
		for(int i=0;i<state.size();i++)
		{
			if(state.get(i).toLowerCase().equals(element))
			{
				System.out.println("Element found at index : "+i);
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		ArrayList<String> states=new ArrayList<String>();
		String statearray[]= {"Kerala","Karnataka","Gujarat",
				"Delhi","Goa","Bihar"};
		states.addAll(Arrays.asList(statearray));
		
		System.out.println("Enter the search element");
		String element=sc.nextLine();
		if(!Search(states,element))
		{
			System.out.println("Element not found");
		}

		sc.close();
	}
}
