package Overriding_runtimePolymorphism;

public class MOclass2 extends MOclass1
{
	@Override
	public void run()
	{
		System.out.println("Runnning..........Child");
	}

	public static void main(String[] args) 
	{
		MOclass2 c=new MOclass2();
		c.run();
		
		System.out.println("Another class object call");
		MOclass2 cd=new MOclass2();
		cd.run();
		

	}

}
