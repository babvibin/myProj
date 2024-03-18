package test;

public class Exception1 {
	public void expMethod(int i)
	{
		if(i<10)
		{
			throw new ArithmeticException("test exception");
		}
		else
		{
			System.out.println("code in else part");
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception1 obj=new Exception1();
		obj.expMethod(1);

	}

}
