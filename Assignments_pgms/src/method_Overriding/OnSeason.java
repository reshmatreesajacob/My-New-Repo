package method_Overriding;

public class OnSeason 
{
	float disc;
	
	public void calculateDiscount(float amount)
	{
		disc=0.40f;
		float price=amount;
		price=price-(price*disc);
		System.out.println("The final price is : " + price);
	}

}
