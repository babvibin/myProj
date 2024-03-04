package assignment2;

public class Offseason extends Onseason {
	public double discount(double beforeDisount)
	{
		double afterDisount=beforeDisount*0.4;
		return afterDisount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason offS=new Offseason();
		double offSeasonAfterDiscount=offS.discount(100.00d);		
		System.out.println("Total Price After Discoount_OFFSEASON: " +offSeasonAfterDiscount);
		
		Onseason onS=new Onseason();
		double onSeasonAfterDiscount=onS.discount(100f);
		System.out.println("Total Price After Discoount_ONSEASON: " +onSeasonAfterDiscount);

	}

}
