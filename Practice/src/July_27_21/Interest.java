package July_27_21;
public class Interest {
public static void main(String[] args) {
		
double total = 900;
double interest = 0;
			
	if (total>3500) {
		// for Odd, interest = 5.5
		// for Even interest = 6.5
	}else if (total >= 2500) {
		// interest should be 3.5
		interest = total * 0.035;
System.out.println("Total is "+total+" which added with interest 3.5% ("+ interest+") is going to be "+(total+ +interest));
	}else if (total >= 900) {
		// interest should be 2.5
		interest = total * (2.5 /100);
System.out.println("Total: "+total+" Interest 2.5% = "+interest+" = "+(total+ +interest));
	}else if (total >= 500) {
		// interest should be 1.5
		interest = total * 1.5 /100;
System.out.println("Total is "+total+" which added with interest 1.5%"+interest+" going to be "+(total+ +interest));
	}else if (total >= 100) {
		// interest should be 1.0
		interest = total * 0.01;
System.out.println("Total is "+total+" which added with interest 1%"+interest+" going to be "+(total+ +interest));
		}else {
		// interest should be 0.0
		interest = 0;	
			System.out.println("Total is "+total+" which added with interest 0%"+interest+" going to be "+(total+ +interest));
		}
		
	
	}
}
