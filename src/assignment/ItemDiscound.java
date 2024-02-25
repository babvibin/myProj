package assignment;

public class ItemDiscound {
	static double total;
	public static void totalAmount(double item1, double item2, double item3)
	{
		total=item1+item2+item3;		
	}
	public static void checkDiscount()
	{
		if(total>5000)
		{
			total=total-(total*0.02);			
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDiscound.totalAmount(1001.0d, 3000.0d, 1000.0d);
		ItemDiscound.checkDiscount();
		System.out.println("Final Amount is: " +total);
	}
}
