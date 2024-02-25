package assignment;
import java.util.Scanner;

public class ConsoleInput {
	int basicPay;
	int deduction;
	int bonus;	
	public void conInput()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Please insert Basic Pay & Click Enter button");
		basicPay=obj.nextInt();
		System.out.println("Please insert Deduction & Click Enter button");
		deduction=obj.nextInt();
		System.out.println("Please insert Bonus & Click Enter button");
		bonus=obj.nextInt();
	}

}
