package assignment;

public class SalarySlip extends calculateHraPf {
	static double totalSalary;
	public void salary()
	{
		totalSalary=super.basicPay+super.hra-super.pf-super.deduction+super.bonus;
	}
	public void SalarySlips()
	{
		System.out.println();
		System.out.println("SALARY SLIP:");
		System.out.println("Basic Pay: " +super.basicPay);
		System.out.println("Deduction: " +super.deduction);
		System.out.println("HRA: " +super.hra);
		System.out.println("PF: " +super.pf);
		System.out.println("Bonus: " +super.bonus);
		System.out.println("Total Salary: " +totalSalary);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalarySlip obj=new SalarySlip();
		obj.conInput();
		obj.calculation();
		obj.salary();
		obj.SalarySlips();
	}
}
