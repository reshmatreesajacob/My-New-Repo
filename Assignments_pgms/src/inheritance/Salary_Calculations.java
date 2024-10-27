package inheritance;

//Class 2: Calculate HRA and PF
public class Salary_Calculations extends Employee_Details 
{
	double hra;
	double pf;
	
	//Method to calculate hra & pf based on Basic Pay
	public void Calculate_HRA_PF() 
	{
		hra=(0.05*basicPay);
		pf=(0.2*basicPay);
	}
}
