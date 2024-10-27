package variables;

class Area_triangle
{
 static float a=11.1f;
 static float b=12.97f;  
 float i=90.11f;
 float w=65.86f;
public static void main(String args[])
{
  float s=0.0f;
//--Using static variable--

  System.out.println("------With static variables------");
  System.out.println("breadth & height are " + a +" &  " + b);
  s=((a*b)/2);	
  System.out.println("Area of triangle is " +s);

//--Using local variable--
  s=0;
  System.out.println("------With local variables------");
  float q=25.54f;
  float m=76.65f;
  System.out.println("breadth & height are " + q +" &  " + m);
   s=((q*m)/2);	
  System.out.println("Area of triangle is " +s);

//--Using Instance variable--
  s=0;
  Area_triangle num=new Area_triangle();
  System.out.println("------With Instance variables------");
  System.out.println("breadth & height are " + num.i +" &  " + num.w);
  s=((num.i*num.w)/2);	
  System.out.println("Area of triangle is " +s);

} }