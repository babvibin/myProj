package assignment;

public class SuperAdditionChild extends SuperAdditionParent{
	public void divisibleBy10(int sum)
	{
		sum=sum%10;
		if(sum==0)
		{
			System.out.println("Sum is disvisible by 10");
		}
		else
		{
			System.out.println("Sum is not divisible by 10");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAdditionChild obj=new SuperAdditionChild();
		int sum=obj.addition(50, 50);
		obj.divisibleBy10(sum);
	}
}
