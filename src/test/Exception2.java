package test;

public class Exception2 {
	public void expMethod(int i)
	{
		try
		{
			int j=10;
			j=j/i;
			System.out.println("code in Try block");
		}
		catch(ArithmeticException a)
		{
			System.out.println("code in catch block");			
		}
		finally
		{
			System.out.println("code in filally block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception2 obj=new Exception2();
		obj.expMethod(0);

	}

}
