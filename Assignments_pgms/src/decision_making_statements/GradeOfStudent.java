package decision_making_statements;

import java.util.Scanner;
class GradeOfStudent
{
 public static void main(String args[])
{
 int a;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your mark out of 100 : ");
 a=sc.nextInt();
 if(a<40)
{
 System.out.println("Failed");
}
else if((a>=40)&&(a<=60))
{
 System.out.println("Grade D");
}
else if((a>=61)&&(a<=70))
{
 System.out.println("Grade C");
}
else if((a>=71)&&(a<=80))
{
 System.out.println("Grade B");
}
else if((a>=81)&&(a<=100))
{
 System.out.println("Grade A");
}
else
{
 System.out.println("Invalid Mark");

}
}
}