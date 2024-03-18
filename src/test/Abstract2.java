package test;

public class Abstract2 extends Abstract1 {
	public void meth3()
	{
		System.out.println("Body of instance method from the Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract2 obj=new Abstract2();
		obj.meth1();
		obj.meth2();
		obj.meth3();

	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("BOdy of Abstract Method");
		
	}

}
