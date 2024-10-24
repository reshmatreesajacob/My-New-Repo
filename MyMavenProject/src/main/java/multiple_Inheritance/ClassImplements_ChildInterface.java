package multiple_Inheritance;

public class ClassImplements_ChildInterface implements ChildInterfaceExtendsInterface
{
	@Override
	public void run() 
	{
		System.out.println("Running............");
	}

	@Override
	public void multipleInheritance1() 
	{
		System.out.println("Parent interface 1 ");
	}

	@Override
	public void multipleInheritance2() 
	{
		System.out.println("Parent interface 2 ");
	}

	@Override
	public void multipleInheritance() 
	{
		System.out.println("Child interface extends from 2 parent interfaces ");
	}

	public static void main(String[] args) 
	{
		ClassImplements_ChildInterface cc=new ClassImplements_ChildInterface();
		cc.run();
		
		Interface_Parentclass1 p1=new ClassImplements_ChildInterface();
		p1.multipleInheritance1();
		
		Interface_ParentClass2 p2=new ClassImplements_ChildInterface();
		p2.multipleInheritance2();
		
		ChildInterfaceExtendsInterface c=new ClassImplements_ChildInterface();
		c.multipleInheritance();
	} }
