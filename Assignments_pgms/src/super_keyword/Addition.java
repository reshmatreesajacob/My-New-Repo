package super_keyword;

public class Addition 
{
	float a;
	float b;
	float sum;
	
	public Addition(float a,float b)
	{
		sum=0;
		this.a=a;
		this.b=b;
	}
	
	public float getAdditionResult()
	{
		sum=a+b;
		return sum;
	}

}
