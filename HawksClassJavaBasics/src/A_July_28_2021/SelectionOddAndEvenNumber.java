package A_July_28_2021;

public class SelectionOddAndEvenNumber {
public static void main(String[] args) {
	
	double total = 4600;
	double interest = 0;
	
	if (total>=3500) {
		if (total %2 == 2) {
			interest = total * 6.5/100;
			System.out.println("total"+total+" which added with interest of 6.5% "+interest+ "is going to be "+total+interest);
			System.out.println("Even");
		} else {
			// for odd interest 5.5
			interest = total * 0.55;
			System.out.println("total " +total+"which added with interest of 5.5% "+interest+ " is going to be "+total+interest);
			System.out.println("Even");
		}		
	}else if (total >=900) {
		//interest should be 2.5 
		interest = total * 0.025;
		System.out.println("total "+total+" which added with interest of 2.5% ("+interest+") is going to be " +(total+interest));
		System.out.println("Odd");						
	}else if (total >=500) {
		//interest should be 1.5
		interest = total * 0.015;
		System.out.println("total "+total+" which added with interest of 1.5% ("+interest+") is going to be " +(total+interest));					
	}else if (total >=100) {
		//interest should be 1.0
		interest = total * 0.01;
		System.out.println("total "+total+" which added with interest of 1.0% ("+interest+") is going to be " +(total+interest));	
	} else {
		interest = 0;
		System.out.println("total"+total+" which added with interest of 1.0% ("+interest+") is going to be " +(total+interest));
				
}
} 
}