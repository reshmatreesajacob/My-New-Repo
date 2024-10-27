package method_overloading;

import java.util.Scanner;

public class Average_And_Area 
{
	//Average of 3 integer no
	public void Average(int a,int b,int c)
	{
		float avg=((a+b+c)/3);
		System.out.println("Average of 3 integers "+a+
				", "+b+", "+c+" is "+avg);
	}
	
	//Average of 3 float no
	public void Average(float a,float b,float c)
	{
		float avg=((a+b+c)/3);
		System.out.println("Average of 3 integers "+a+
				", "+b+", "+c+" is "+avg);
	}
	
	//Area of Circle
	public void Area(float radi)
	{
		double area=(3.14*radi*radi);
		System.out.println("Area of Circle of Radius "+radi+" is "+area);
	}
	
	public void Area(float length,float breadth)
	{
		double area=(0.5*length*breadth);
		System.out.println("Area of Rectangle of length "+length+
				" & breadth "+breadth+" is "+area);
	}
	
	public void Area(double side)
	{
		double area=(side*side);
		System.out.println("Area of Square of side "+side+
				" is "+area);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Average_And_Area aaa=new Average_And_Area();
		
		//Average of 3 integer no
		int a,b,c;
		System.out.println("Enter 3 integer nos");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		aaa.Average(a,b,c);
		
		//Average of 3 float no
		float p,q,r;
		System.out.println("Enter 3 flaot nos ");
		p=sc.nextFloat();
		q=sc.nextFloat();
		r=sc.nextFloat();
		aaa.Average(p,q,r);
		
		//Area of Circle
		System.out.println("Enter the radius of the circle ");
		r=sc.nextFloat();
		aaa.Area(r);
		
		//Area of rectangle
		System.out.println("Enter the length & breadth of the rectangle ");
		p=sc.nextFloat();
		q=sc.nextFloat();
		aaa.Area(p,q);
		
		//Area of Square
		double s;
		System.out.println("Enter the side of square ");
		s=sc.nextDouble();
		aaa.Area(s);
		
		sc.close();
	}

}
