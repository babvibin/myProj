package assignment;

public class Factorial {
	int num;
	int factorial=1;
	public void fact(int num)
	{
		this.num=num;
		for(int i=1;i<=num;i++)
		{
			this.factorial=factorial*i;
		}
		this.display();
	}
		public void display()
		{
			System.out.println("Factorial of " +num+ " is: " +factorial);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj=new Factorial();
		obj.fact(5);

	}

}
