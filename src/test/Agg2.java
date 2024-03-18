package test;

public class Agg2 {
	
	String place;
	Agg1 a;
	public void display(String place,Agg1 a)
	{
		this.a=a;
		this.place=place;
		System.out.println(a.amount);
		System.out.println(a.name);
		System.out.println(place);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agg1 obj=new Agg1();
		obj.cash(100, "John");
		
	    Agg2 obj2=new Agg2();
		obj2.display("Virgenia", obj);
		

	}

}
