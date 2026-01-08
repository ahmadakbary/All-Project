package sept_01_2021ExceptionHandling;
public class MultiTryAndCatch {
public static void main(String[] args) {
		
	int a = 10;
	int b = 0;
	
	String x = "";
	System.out.println(x.length());
	
try {
	printDiv(a,b); 	
	}catch (ArithmeticException e ) {
	e.printStackTrace();
	}catch(Exception e ) {
	}finally {// finally get executed at the end of the try catch block regardless
			// of you catching any execution
	System.out.println("this is the finally blcok");
	System.out.println("You tried to divide by zero and we can not do thta.");		
	}	
	System.out.println("End of the app, after the try catch");
	}
	public static void printDiv(int a, int b) {
	System.out.println(a/b);
		

	}

}
