package sept_01_2021ExceptionHandling;
public class ExceptionHandlingTryAndCatch {
public static void main(String[] args) {
	
	int a = 10;
	int b = 0;
	
	String x = "";
	System.out.println(x.length());
	
try {
//this is the area that you will add the code you are trying to run
//this is the code that you suspect might cause an exception
	printDiv(a,b); // if this code is risky we put it inside the try and catch block		
	}catch (ArithmeticException e ) {
//the catch will only get executed if and only if the execution occurs
	System.out.println("You tried to divide by zero and we can not do thta.");		
	}	
	System.out.println("End of the app, after the try catch");
	}
	public static void printDiv(int a, int b) {
		System.out.println(a/b);
		

	}

}
