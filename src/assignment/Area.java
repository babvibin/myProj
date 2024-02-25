package assignment;

public class Area {
	
	public static void area(float r)
	{
		double a=3.14*r*r;
		System.out.println("Area of Circle is: " +a);
	}
	public static void area(int length, int breadth)
	{
		long a=length*breadth;
		System.out.println("Area of Rectangle is: " +a);
	} 
	public static void area(int length)
	{
		long a=length*length;
		System.out.println("Area of Square is: " +a);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area.area(10f);
		Area.area(5,7);
		Area.area(5);

	}

}
