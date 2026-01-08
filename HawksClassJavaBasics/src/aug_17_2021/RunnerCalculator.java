package aug_17_2021;
public class RunnerCalculator {
public static void main(String[] args) {
	
		Calculator obj = new Calculator();
		obj.getsum(15.8, 59.48);
		obj.getDiv(15, 0);
		
//getMult is stored in result double data n then printed
	double result=obj.getMult(5, 5);
	    System.out.println(result);
		
	double SubtractionResult=obj.getSubtraction(500, 345);
		System.out.println(SubtractionResult);

	}

}
