package july_27_2021;
public class SelectionInterest {
public static void main(String[] args) {	 
		 // Customer Receipt Verifications
		  // if the total is within these ranges and change interest based on that
		  // for odd, interest = 5.5
		  // for even, interest = 6.5
		  // for totals 2500 - 3500, interest should be 3.5
		  // for totals 900- 2500, interest should be 2.5 
		  // for totals 500 - 900, interest should be 1.5
		  // for totals 100 - 500 interest should be 1.0	 	  
		 double total = 2600;
		 double interest = 0;
		
		 if (total > 3500) {
	// for odd, interest = 5.5
	 // for even, interest = 6.5						
	 }else if (total>= 900) {
	//interest should be 3.5
		interest = total * 0.035;
		System.out.println("your total was "+total+" which added with interest of 3.5% ("+interest+") is going to be " +(total+interest));	
		
	}else if (total >=900) {
		//interest should be 2.5 
		interest = total * 0.025;
		System.out.println("your total was "+total+" which added with interest of 2.5% ("+interest+") is going to be " +(total+interest));
						
	}else if (total >=500) {
		//interest should be 1.5
		interest = total * 0.015;
		System.out.println("your total was "+total+" which added with interest of 1.5% ("+interest+") is going to be " +(total+interest));
						
	}else if (total >=100) {
		//interest should be 1.0
	interest = total * 0.01;
	System.out.println("your total was "+total+" which added with interest of 1.0% ("+interest+") is going to be " +(total+interest));
		
	} else {
		interest = 0;
		System.out.println("your total was "+total+" which added with interest of 1.0% ("+interest+") is going to be " +(total+interest));
			
		}
			
		  }
	}


