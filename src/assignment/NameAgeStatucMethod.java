package assignment;

public class NameAgeStatucMethod {
	static String name;
	static int age;
	public static void nameAge(String a, int b)
	{
		name=a;
		age=b;
	}
	public static void display()
	{
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameAgeStatucMethod.nameAge("John", 27);
		NameAgeStatucMethod.display();
	}
}
