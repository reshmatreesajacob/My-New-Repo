package array;
import java.util.Scanner;
public class Sum_of_Array {

	public static void main(String[] args) 
	{
		//For Single Dimensional Array
		int sum=0;
		int arr[]=new int[6];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Single dimensional array of 6 elements");
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<6;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of all elements is "+ sum);
		
		//For Multi-Dimensional Array
		int brr[][]=new int[3][3];
		sum=0;
		System.out.println("Enter the elements of an array of size 3*3");
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  brr[i][j]=sc.nextInt();
		  }
		}
		for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
		  {
			  sum=sum+brr[i][j];
		  }
		}
		System.out.println("The sum of all elements is "+ sum);
	}
}
