package string;

public class Palindrome 
{	
	public boolean palindrome_usingString(String st)
	{	
		st=st.toLowerCase();
		// Convert to lowercase to handle case sensitivity
		String p=new String(st); 
		int l=p.length();
		
		for(int i=0;i<=l/2;i++)
		{
			if (p.charAt(i) != p.charAt(l-i-1))
			{
				// If characters don't match, it's not a palindrome
				return false;
			}
		}
		// If characters match, it's a palindrome
		return true;
	}
	
	public boolean palindrome_usingStringBuilder(String st)
	{
		st=st.toLowerCase();
		StringBuilder p=new StringBuilder(st);
		
		// Reverse and compare with original string
		return p.reverse().toString().equals(p);
		
//return p.reverse().equals(p); ==> incorrect,because 
//		it is comparing the reversed string with itself
	}
	
	public boolean palindrome_usingStringBuffer(String st)
	{
		st=st.toLowerCase();
		StringBuffer p=new StringBuffer(st);
		
		return p.reverse().toString().equals(p);
//correct approach because it compares the reversed string 
//		(p.reverse().toString()) to the original string (st).

	}

	public static void main(String[] args) 
	{
		Palindrome p=new Palindrome();
		
		String s1="Java";
		String s2=new String("Malayalam");
		
		// Checking palindrome using all three methods
        System.out.println("Using String:");
        System.out.println(s1 + " is palindrome: " + p.palindrome_usingString(s1)); // False
        System.out.println(s2 + " is palindrome: " + p.palindrome_usingString(s2)); // True
        
        System.out.println("\nUsing StringBuilder:");
        System.out.println(s1 + " is palindrome: " + p.palindrome_usingStringBuilder(s1)); // False
        System.out.println(s2 + " is palindrome: " + p.palindrome_usingStringBuilder(s2)); // True
        
        System.out.println("\nUsing StringBuffer:");
        System.out.println(s1 + " is palindrome: " + p.palindrome_usingStringBuffer(s1)); // False
        System.out.println(s2 + " is palindrome: " + p.palindrome_usingStringBuffer(s2)); // True
    
		

	}

}

//return p.reverse().toString().equals(st); is the correct approach 
//because it compares the reversed string (p.reverse().toString())
//to the original string (st).

//return p.reverse().equals(p); is incorrect because it is comparing the
//reversed string with itself, which will always return true after
//reversing, and it won't give the correct result for palindrome checks.