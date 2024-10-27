package variables;

public class addinteger_float
{
 static float a=1.1f;
 static int b=12;  
 float i=9.9f;
 int w=65;
public static void main(String args[])
{
  double s=0f;
//--Using static variable--

  System.out.println("------With static variables------");
  System.out.println("a=" +a +" b=" +b);
  s=a+b;	
  System.out.println("sum is " +s);

//--Using local variable--
  
  s=0;
  System.out.println("------With local variables------");
  float q=1.23f;
  int m=76;
  System.out.println(" q =" +q +" m =" +m);
  s=q+m;
  System.out.println("sum is " +s);

//--Using Instance variable--
  
  s=0;
  addinteger_float num=new addinteger_float();
  System.out.println("------With Instance variables------");
  System.out.println("i =" +num.i +" w =" +num.w);
  s=num.i+num.w;
  System.out.println("sum is " +s);

} }