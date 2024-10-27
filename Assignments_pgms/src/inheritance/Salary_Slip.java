package inheritance;

public class Salary_Slip extends Salary_Calculations 
{
	double totalSalary;
	
	//Method to Calculate Total Salary
	public void Total_Salary()
	{
		totalSalary=basicPay+hra-pf-deduction+bonus;
	}
	
	//Method to display Salary slip
	public void display()
	{
		System.out.println("\n"+"========= Salary Slip =========");
		System.out.println("Basic Pay    : " +basicPay);
		System.out.println("Deduction    : "+deduction);
		System.out.println("HRA          : "+hra);
		System.out.println("PF           : "+pf);
		System.out.println("Bonus        : "+bonus);
		System.out.println("Total Salary : "+totalSalary);
		System.out.println("===============================");
	}

	public static void main(String[] args) 
	{
		Salary_Slip ss=new Salary_Slip();
		
		//Getting Employee Details
		ss.getDetails();
		
		//Calculating Hra & Pf
		ss.Calculate_HRA_PF();
		
		//Calculationg Total salaray
		ss.Total_Salary();
		
		//To display salary slip
		ss.display();
	}
}
