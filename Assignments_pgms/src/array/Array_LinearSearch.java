package array;

import java.util.Scanner;

public class Array_LinearSearch {

	public static void main(String[] args) 
	{
		
		//For Single Dimensional Array
		int arr[]=new int[6];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Single dimensional array of 5 elements");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int ele=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("Element found at "+i+"th position");
				break;
			}
		}
		
		//For Multi-Dimensional Array
		int brr[][]=new int[3][3];
		System.out.println("Enter the elements of an array of size 3*3");
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  brr[i][j]=sc.nextInt();
		  }
		}
		System.out.println("Enter the element to be searched");
		ele=sc.nextInt();
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  if(brr[i][j]==ele)
			  {
				  System.out.println("Element found at ["+i+"]*["+j+"]th position");
				  break;  
			  }
		  }
		}


	}

}
