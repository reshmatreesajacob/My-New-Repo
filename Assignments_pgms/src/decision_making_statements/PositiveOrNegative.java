package decision_making_statements;

import java.util.Scanner;
class PositiveOrNegative
{
 public static void main(String args[])
{
 double a;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a no to be checked : ");
 a=sc.nextDouble();
 if(a>0)
{
 System.out.println("Its a positive no");
}
else 
{
 System.out.println("Its a negative no");
}
}
}