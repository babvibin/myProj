package test;

public class Third extends Second{
	public void test()
	{
		int k=super.i;
		System.out.println(k);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third obj=new Third();
		//obj.display1();
		obj.test();
		
		

	}

}
