package decision_making_statements;

import java.util.Scanner;
class DrivingLicenseEligible
{
 public static void main(String args[])
{
 int a;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your age : ");
 a=sc.nextInt();
 if(a>=18)
{
 System.out.println("You are eligible");
}
else 
{
 System.out.println("You are not eligible");
}
}
}