package collection_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoverElements 
{
	//Method to remove an element
	public static ArrayList<String> RemoveAnElement(ArrayList<String> state,int index)
	{
		ArrayList<String> newState=new ArrayList<String>();
		newState=state;
		newState.remove(index);
		System.out.println("\nAfter Removing");
		display(newState);
		return newState;
	}
	
	//method to display arraylist
	public static void display(ArrayList<String> content)
	{
		for(String s:content)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) 
	{
		ArrayList<String> States=new ArrayList<String>();
		
        // Use Arrays.asList - convert array to list 
		States.addAll(Arrays.asList("Kerala","Karnataka","Gujarat",
				"Delhi","Goa","Bihar"));
		
		System.out.println("Before Removing");
		display(States);
	    
		//Method to remove an element
		States=RemoveAnElement(States, 3);
	}
}
