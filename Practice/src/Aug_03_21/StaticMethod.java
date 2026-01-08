package Aug_03_21;

public class StaticMethod {
public static void main(String[] args) {
	
 System.out.println("This is Addition Methods");
	addition(23, 34);
	addition(10, 20);

	
 System.out.println("This is Subtractions");
 subtraction(15, 10);
 subtraction(100, 50);

 
 System.out.println("This is multiplication");
 multiplication(5, 5);
 multiplication(2, 4);

 
 System.out.println("This is Divission");
 division(100, 5);
 division(50, 2);
 
 
 
}	
	public static void addition(int a, int b) {
		int sum = (a+b);
		System.out.println("Sum of a & b is: "+sum);
	}
	public static void subtraction (int a, int b) {
		int sum = a-b;
		System.out.println("sum of a & b is: "+sum);
	}
	public static void multiplication(double a, double b) {
		double sum = a*b;
		System.out.println("sum of a & b is: "+sum);		
	}
	public static void division(long a, long b) {
		long sum = a/b;
		System.out.println("sum of a & b is: "+sum);
	
	
	
}
}
