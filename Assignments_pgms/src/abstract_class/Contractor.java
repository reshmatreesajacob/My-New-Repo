package abstract_class;

public class Contractor extends Employee 
{	
	public Contractor(String name,int paymentPerHour)
	{
		super(name,paymentPerHour);
	}

	@Override
	public void CalculateSalary(int workingHours) 
	{
		int salary=paymentPerHour*workingHours;
		System.out.println("salary of " +name+" is " +salary);	
	}

}
