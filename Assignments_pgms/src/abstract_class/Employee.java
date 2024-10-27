package abstract_class;

public abstract class Employee 
{
	String name;
	int paymentPerHour;
	
	public Employee(String name,int paymentPerHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;	
	}
	
	// Abstract method to be implemented by subclasses
	public abstract void CalculateSalary(int workingHours);

}
