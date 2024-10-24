package multiple_Inheritance;

public class ChildclassImplementsInterface implements Interface_Parentclass1,Interface_ParentClass2
{
	@Override
	public void run()
	{
		System.out.println("Running");
	}
	
	public void multipleInheritance1()
	{
		System.out.println("Parent interface 1");
	}
	
	public void multipleInheritance2()
	{
		System.out.println("Parent interface 1");
	}

	public static void main(String[] args) 
	{
		Interface_Parentclass1 a=new ChildclassImplementsInterface();
		a.multipleInheritance1();
		
		Interface_ParentClass2 b= new ChildclassImplementsInterface();
		b.multipleInheritance2();
		
		ChildclassImplementsInterface c=new ChildclassImplementsInterface();
		c.run();

	}
}
