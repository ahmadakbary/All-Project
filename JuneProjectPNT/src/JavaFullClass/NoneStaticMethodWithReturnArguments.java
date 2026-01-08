package JavaFullClass;
public class NoneStaticMethodWithReturnArguments {
public static void main(String[] args) {
		
	NoneStaticMethodWithReturnArguments ahmad=new NoneStaticMethodWithReturnArguments();
	int profitbeforetax=ahmad.CalculationOfCompany(10000, 500, "Jan");
	int profitaftertax=profitbeforetax=50;
	System.out.println(profitaftertax);
	ahmad.CalculationOfCompany(1500, 500, "Feb");
	ahmad.CalculationOfCompany(2000, 500, "March");
	ahmad.CalculationOfCompany(2500, 500, "April");	
}
	public int CalculationOfCompany(int income, int expense, String Month) {
		int profit=income-expense;
		System.out.println("profit of Month "+Month+"="+profit);
		return profit;
		
	}
	}
