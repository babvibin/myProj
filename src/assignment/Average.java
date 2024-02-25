package assignment;

public class Average {
	
	public static void average(int i, int j, int k)
	{
		int avrg=(i+j+k)/3;
		System.out.println("Average of 3 integer numbers is: " +avrg);
	}
	public static void average(float i, float j, float k)
	{
		float avrg=(i+j+k)/3;
		System.out.println("Average of 3 floating numbers is: " +avrg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average.average(10,10,10);
		System.out.println();
		Average.average(10.11f,10.11f,10.11f);	

	}

}
