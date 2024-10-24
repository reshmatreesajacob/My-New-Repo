package abstraction;
//abstract class
public abstract class AbstractParentClass 
{
	//abstract method
	public abstract void run();
	
	//non-abstract methods
	public void display()
	{
		System.out.println("Non Abstract "
			+ "method in Abstract Class");
	}
}
