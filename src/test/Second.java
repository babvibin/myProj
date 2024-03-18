package test;

public class Second extends First{
	
	int i=15;
	public void display2()
	{
		System.out.println("Method of Second Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second obj=new Second();
		System.out.println(obj.i);
		obj.display1();

	}

}
