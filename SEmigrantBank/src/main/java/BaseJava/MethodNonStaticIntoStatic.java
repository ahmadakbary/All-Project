package BaseJava;
public class MethodNonStaticIntoStatic {
public static void main(String[] args) {
	MethodNonStaticIntoStatic obj = new MethodNonStaticIntoStatic();
	double beforeTax = obj.CompanyCalculations(100.99, 50, "January");

	double profitbeforeTax=obj.CompanyCalculations(800, 500, "Feb");
	double profitAfterTax=profitbeforeTax =100;
	obj.CompanyCalculations(80, 50, "March");
	obj.CompanyCalculations(20, 10, "April");
	obj.CompanyCalculations(100, 50, "May");
			
}
	public double CompanyCalculations(double income, double expense, String months) {
		double profit = income-expense;
		System.out.println("Profit of "+months+ " is-->"+"\t"+profit);
		return profit;
				
				
				
	}
	
}
