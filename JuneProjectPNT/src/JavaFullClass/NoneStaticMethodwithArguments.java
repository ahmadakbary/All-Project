package JavaFullClass;
public class NoneStaticMethodwithArguments {
public static void main(String[] args) {
	
		NoneStaticMethodwithArguments ahmad=new NoneStaticMethodwithArguments ();
		ahmad.calculationOfCompany(1000, 500, "jan");
		ahmad.calculationOfCompany(1500, 500, "Feb");
		ahmad.calculationOfCompany(2000, 500, "March");
		ahmad.calculationOfCompany(2500, 500, "May");
}
public void calculationOfCompany(int income, int expense, String Month) {
		int profit=income-expense;
		System.out.println("profit of Month "+Month+"=" + profit);
	
}
	}


