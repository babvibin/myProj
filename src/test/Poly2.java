package test;

public class Poly2 extends Poly1{
	
	public void display()
	{
		System.out.println("Child Class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poly1 obj=new Poly2();
		obj.display();
		
		Poly2 obj2=new Poly2();
		obj.display();
		
		Poly1 obj3=new Poly1();
		obj3.display();

	}

}
