package collection_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Retrieve_PrimeNos 
{
	//to check a no is prime or not
	public static boolean IsPrime(int no)
	{
		for (int i = 2; i <= Math.sqrt(no); i++) 
		{
            if (no % i == 0)
            	return false;
        }
		return true;	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		ArrayList <Integer> primeNo=new ArrayList <Integer>();
		System.out.println("Enter the no of prime nos : ");
		int size=sc.nextInt();
		
		//code to insert the prime nos
		int num=2;
		while(primeNo.size()<size)
		{
			if(IsPrime(num))
			{
				primeNo.add(num);
			}
			num++;
		}
		
		//Retrieving elements using index
		System.out.println("Enter the index you want to retrieve: ");
		int index=sc.nextInt();
		System.out.println("No is " + primeNo.get(index));
		
		//Retrieving elements using content
		System.out.println("Enter the no you want to retrieve: ");
		int no=sc.nextInt();
		System.out.println("Index of No is " + primeNo.indexOf(no));
		sc.close();
	}
}
