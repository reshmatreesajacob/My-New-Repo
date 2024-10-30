package Interface;

public interface RBI 
{
	double interestRate=6.5f;
	
	abstract void recurringDeposit(double amount,
			int duration,String interestType);

}
