package assignment;

public class Palindrome {
	static int num;
	static int rev=0;
	static int rem;
	public static void NumberReverse(int num1)
	{
		num=num1;
		while(num1>0)
		{
			rem=num1%10;
			//System.out.println("TEST.... " +rem);
			rev=(rev*10)+rem;
			num1=num1/10;			
		}
		System.out.println("Reversed Number is: " +rev);		
	}
	public static void palindromeCheck()
	{
		if(num==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome.NumberReverse(123321);
		Palindrome.palindromeCheck();
	}
}
