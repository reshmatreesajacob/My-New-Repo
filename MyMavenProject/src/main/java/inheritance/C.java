package inheritance;

public class C extends B{
	
	int n=30;

	public static void main(String[] args) 
	{
		C c=new C();
		System.out.println(c.a);
		System.out.println(c.v);
		System.out.println(c.n);
		c.run();
		c.use();

	}
}
