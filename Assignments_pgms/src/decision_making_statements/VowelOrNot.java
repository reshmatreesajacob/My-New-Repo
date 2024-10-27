package decision_making_statements;

import java.util.Scanner;
public class VowelOrNot
{
 public static void main(String args[])
{
 char s;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a character : ");
 s=sc.next().charAt(0);
 switch(Character.toLowerCase(s))
{
 case 'a':
	System.out.println("Given Character is Vowel");
	break;
 case 'e':
	System.out.println("Given Character is Vowel");
	break;
 case 'i':
	System.out.println("Given Character is Vowel");
	break;
 case 'o':
	System.out.println("Given Character is Vowel");
	break;
 case 'u':
	System.out.println("Given Character is Vowel");
	break;
 default:
	System.out.println("Given Character is Not a Vowel");
}
sc.close();
}
}