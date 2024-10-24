package interfaceWorking;

public class ChildClass implements ParentClass
{
	@Override
	public void run()
	{
		System.out.println("Running......");
	}

	public static void main(String[] args) 
	{
		ParentClass p= new ChildClass();
	    p.run();
		
		ChildClass c=new ChildClass();

	}
}
