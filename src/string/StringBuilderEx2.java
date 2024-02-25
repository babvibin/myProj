package string;

public class StringBuilderEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder obj=new StringBuilder("Hello");
		System.out.println(obj);
		obj.replace(1, 3,"ABC"); // replaces 1,2 only. that is from 1 till (3-1).
		System.out.println(obj);

	}

}
