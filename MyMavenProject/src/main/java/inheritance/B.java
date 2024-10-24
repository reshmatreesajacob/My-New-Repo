package inheritance;

public class B extends A
{
	int v=12;
	public void use() 
	{
		System.out.println("Use Method");
	}
	public static void main(String[] args) 
	{
		B br=new B();
		System.out.println(br.a);
	    br.run();
	}

}
