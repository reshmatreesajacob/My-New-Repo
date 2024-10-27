package command_Line_Argument;

public class CommandLine_Argument
{
   public static void main(String args[])
{
  int a=Integer.valueOf(args[0]);
  int b=Integer.valueOf(args[1]);
  int sum=a+b;
  System.out.println("sum is : "+ sum);
}
}