package abstraction;

public class Childclass extends AbstractParentClass 
{
	@Override
	public void run()
	{
		System.out.println("Running");
	}

	public static void main(String[] args) 
	{
		// Parent p=new child();
		AbstractParentClass ab=new Childclass();
		ab.run();
		
		//Child c= new Child();
		Childclass c=new Childclass();
		c.display();

	}
}
