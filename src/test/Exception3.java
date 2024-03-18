package test;

public class Exception3 {
	public void expMethod(int i) throws MyException
	{
		if(i<10)
		{
			throw new MyException("test exception");
		}
		else
		{
			System.out.println("code in else part");
			
		}
	}

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Exception3 obj=new Exception3();
		obj.expMethod(0);


	}

}
