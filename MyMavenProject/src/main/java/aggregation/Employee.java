package aggregation;

public class Employee 
{
	int id;
	String name;
	Address addr; // Or Address address;

	public Employee(int id,String name,Address addr) 
	{
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
	
	public void printDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(addr.city);
		System.out.println(addr.state);
		System.out.println(addr.country);
	}

	public static void main(String[] args) 
	{
		Address ad1=new Address("TVM","KERALA","INDIA");
		Employee e1=new Employee(1,"RESHMA",ad1);
		e1.printDetails();
		
		Address ad2=new Address("KOLLAM","KERALA","INDIA");
		Employee e2=new Employee(2,"JASMINE",ad2);
		e2.printDetails();

	}

}
