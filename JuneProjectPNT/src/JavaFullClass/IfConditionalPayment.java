package JavaFullClass;
public class IfConditionalPayment {
public static void main(String[] args) {
		
		double InterestRate = 2.10;
		
		if (InterestRate>=4 & InterestRate<=4.45) {
			System.out.println("January High interest Payment");
		
			}else if (InterestRate>=3.85 & InterestRate<=4) {
			System.out.println("Febaury Medium Interest Payment");
			
			}else if (InterestRate>=3 & InterestRate<=3.25) {
				System.out.println("March good interest Payment");
				
			}else if (InterestRate>=2.50 & InterestRate<=2.80) {
				System.out.println("April Low Interest Payment");
				
			}else if (InterestRate>=2 & InterestRate<=2.25) {
				System.out.println("May Payment");
			
			} else {
			System.out.println("High Payment due to bad credit");
		
	}
	}
}
