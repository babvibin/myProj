package test;

public class Interface2 implements Interface1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Body of method declared in Interface");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj=new Interface2();
		obj.display();

	}

}
