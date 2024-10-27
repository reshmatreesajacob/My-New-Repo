package variables;

class swapnumbers_temp
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
  System.out.println("Before swap a=" +a +" b=" +b);
  s=a;
  a=b;
  b=s;	
  System.out.println("After swap a=" +a +" b=" +b);

//--Using local variable--
  s=0;
  System.out.println("------With local variables------");
  int q=25;
  int m=76;
  System.out.println("Before swap q =" +q +" m =" +m);
  s=q;
  q=m;
  m=s;
  System.out.println("After swap q =" +q +" m =" +m);

//--Using Instance variable--
  s=0;
  swapnumbers num=new swapnumbers();
  System.out.println("------With Instance variables------");
  System.out.println("Before swap i =" +num.i +" w =" +num.w);
  s=num.i;
  num.i=num.w;
  num.w=s;
  System.out.println("After swap i =" +num.i +" w =" +num.w);

} }