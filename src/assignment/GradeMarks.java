package assignment;

public class GradeMarks {
	String Grade;
	static long TotalMarks;
	public GradeMarks(long physics, long chemistry, long maths)
	{
		this.TotalMarks=0;
		this.TotalMarks=physics+chemistry+maths;
		if(TotalMarks>=250)
		{
			System.out.println("Grade is: A");
		}
		else if(TotalMarks<=250 && TotalMarks>=150)
		{
			System.out.println("Grade is: B");
		}
		else
		{
			System.out.println("Grade is: C");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Peter Tosh");
		GradeMarks obj1=new GradeMarks(75,50,45);
		System.out.println("TotalMarks is: " +TotalMarks);
		System.out.println();
		
		System.out.println("John Doe");
		GradeMarks obj2=new GradeMarks(50,40,10);
		System.out.println("TotalMarks is: " +TotalMarks);
		

	}

}
