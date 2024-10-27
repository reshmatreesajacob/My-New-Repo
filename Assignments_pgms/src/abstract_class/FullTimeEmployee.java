package abstract_class;

public class FullTimeEmployee extends Employee
{
	public FullTimeEmployee(String name, int paymentPerHour) 
	{
		super(name,paymentPerHour);
	}
	
	@Override
	public void CalculateSalary(int workingHours)
	{
		workingHours=8; // Full-time employees work 8 hours per day
		int salary=paymentPerHour*workingHours;
		System.out.println("salary of " +name+" is " +salary);	
	}
}