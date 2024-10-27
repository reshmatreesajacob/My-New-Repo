package variables;

public class addinteger
{
 static int a=11;
 static int b=12;  
 int i=90;
 int w=65;
public static void main(String args[])
{
  int s=0;
//--Using static variable--

  System.out.println("------With static variables------");
  System.out.println("a=" +a +" b=" +b);
  s=a+b;	
  System.out.println("sum is " +s);

//--Using local variable--
  s=0;
  System.out.println("------With local variables------");
  int q=25;
  int m=76;
  System.out.println(" q =" +q +" m =" +m);
  s=q+m;
  System.out.println("sum is " +s);

//--Using Instance variable--
  s=0;
  addinteger num=new addinteger();
  System.out.println("------With Instance variables------");
  System.out.println("i =" +num.i +" w =" +num.w);
  s=num.i+num.w;
  System.out.println("sum is " +s);

} }