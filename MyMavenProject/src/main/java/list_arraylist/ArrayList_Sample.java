package list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Sample {

	public static void main(String[] args) 
	{
		ArrayList <String> ar=new ArrayList <String>();
		
		//To add
		ar.add("Java");
		ar.add("Test");
		ar.add("Aparna");
		ar.add("Devi");
		ar.add("Suhail");
		ar.add("Midhun");
		ar.add("Sreelekshmi");
		System.out.println(ar);
			
		//to get element@ specified index
		String m=ar.get(3);
		System.out.println(m);
		
		//To check an element
		boolean s=ar.contains("Reshma");
		System.out.println(s);
		
		//to find size
		int q=ar.size();
		System.out.println(q);
		
		//to remove elements
		ar.remove(3);
		System.out.println(ar);
		
		//Iterator
		Iterator <String> itr=ar.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		//for each loop
		for(String a:ar)
		{
			System.out.println(a);
		}
		
		//For Array
		System.out.println("For each loop for Array : ");
		int a[]= {23,46,25,67,12,566,23};
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
