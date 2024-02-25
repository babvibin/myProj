package assignment;

public class FactorialStaticMethod {
	public static void factorial(int num)
	{
		long fact=1;
		for(int i=1;i<=num;i++)
		{			
			fact=fact*i;
		}
		System.out.println("Factorial of " +num+ " is " +fact+ ".");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialStaticMethod.factorial(5);
	}
}
