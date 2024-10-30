package custom_Exception;

public class MyExceptionClass extends Exception {
	
	public MyExceptionClass(String a)
	{
		System.out.println(a);
	}
	
	public MyExceptionClass()
	{
		System.out.println("Insufficeint Balance");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
