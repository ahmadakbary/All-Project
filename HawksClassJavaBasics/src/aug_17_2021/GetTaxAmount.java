package aug_17_2021;
public class GetTaxAmount {
	
	public double getTaxAmount(double amount, double percent) {
System.out.println("For amount of $"+amount+" and tax rate of %"+percent+"your tax amount will be $"+(amount * percent/100));
	return amount * percent/100;
		
	}

}
