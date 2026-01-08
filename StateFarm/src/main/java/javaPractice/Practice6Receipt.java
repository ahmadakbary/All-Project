package javaPractice;

public class Practice6Receipt {

	public static void main(String[] args) {
		
		
		double total= 900;
		double interest = 0;
		
		if (total >3500) {
			
		}else if (total>2500) {
			//interest = total * (3.5/100);
			interest = total * 0.035;
			System.out.println("Total: "+total+ "Interest 3.5% "+interest+ " = " + (total + interest));
			
		}else if (total >= 900) {
			//interest = total * (2.5/100);
			interest = total * (2.5/100);
			System.out.println("Total: "+total+ "Interest: 2.5% "+interest+ " = " + (total + interest));
		
		}else if (total>=500) {
			//interest = total * (1.5/100);
			interest = total * (1.5/100);
			System.out.println("You are total was "+total+ "Which added with interest 1.5% ("+interest+") is going to be " + (total + interest));
			
		}else if (total>=100) {
			//interest = total * (1.0/100);
			interest = total * (1.0/100);
			System.out.println("You are total was "+total+ "Which added with interest 1.0% ("+interest+") is going to be " + (total + interest));
			
		}else {
			//interest = 0;
			interest = 0;
			System.out.println("You are total was "+total+ "Which added with interest 0.0% ("+interest+") is going to be " + (total + interest));
			
		}
	}
}
