package assignment;

public class NumberReverse {
	
	int num;
	int rev=0;
	int rem;
	public NumberReverse(int num)
	{
		this();
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;			
		}
		System.out.println("Reversed Number is: " +rev);		
	}
	public NumberReverse()
	{
		System.out.println("Finding Reverse...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberReverse obj=new NumberReverse(12345);
	}
}
