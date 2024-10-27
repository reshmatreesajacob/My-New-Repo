package variables;

class swapnumbers
{
 static int a=11;
 static int b=12;  
 int i=90;
 int w=65;
public static void main(String args[])
{
//--Using static variable--

  System.out.println("------With static variables------");
  System.out.println("Before swap a=" +a +" b=" +b);
  a=a+b;
  b=a-b;
  a=a-b;	
  System.out.println("After swap a=" +a +" b=" +b);

//--Using local variable--

  System.out.println("------With local variables------");
  int q=25;
  int m=76;
  System.out.println("Before swap q =" +q +" m =" +m);
  q=q+m;
  m=q-m;
  q=q-m;
  System.out.println("After swap q =" +q +" m =" +m);

//--Using Instance variable--

  swapnumbers num=new swapnumbers();
  System.out.println("------With Instance variables------");
  System.out.println("Before swap i =" +num.i +" w =" +num.w);
  num.i=num.i+num.w;
  num.w=num.i-num.w;
  num.i=num.i-num.w;
  System.out.println("After swap i =" +num.i +" w =" +num.w);

} }