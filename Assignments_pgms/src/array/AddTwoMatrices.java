package array;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		
		int arr[][]=new int[4][4];
		int brr[][]=new int[4][4];
		int sum[][]=new int[4][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of 1st array of size 3*3");
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  arr[i][j]=sc.nextInt();
		  }
		}
		System.out.println("Enter the elements of 2nd array of size 3*3");
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  brr[i][j]=sc.nextInt();
		  }
		}
		System.out.println("Sum of two Matrices");
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  sum[i][j]=arr[i][j]+brr[i][j];
			  System.out.println(sum[i][j]);
		  }
		}
		sc.close();
	}

}
