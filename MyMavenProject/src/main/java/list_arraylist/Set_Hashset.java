package list_arraylist;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Hashset {

	public static void main(String[] args) 
	{
		HashSet <String> ar=new HashSet <String>();
		
		//To add
		ar.add("Java");
		ar.add("Test");
		ar.add("Aparna");
		ar.add("Devi");
		ar.add("Suhail");
		ar.add("Midhun");
		ar.add("Sreelekshmi");
		System.out.println(ar);
		
		//To check an element
		boolean s=ar.contains("Devi");
		System.out.println(s);	
		
		//to find size
		int q=ar.size();
		System.out.println(q);
		
		//to remove elements
		ar.remove("Test");
		System.out.println(ar);
		
		Iterator <String> itr=ar.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("For each loop for Array : ");
		for(String st:ar)
		{
			System.out.println(st);
		}
		
		
		
				
				
				
				
				
				
				
				
				

	}

}
