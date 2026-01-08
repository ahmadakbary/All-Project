package javaPractice;
public class Practice10StaticsMethods {
	public static void main(String[] args) {
		System.out.println("This is for Addition");
		Addition(10, 15);
		Addition(5, 15);
		
		System.out.println("This is Multiplication");
		multiplication(10, 5);
		multiplication(5, 5);
		
		
		System.out.println("This is Subtraction");
		Subtraction(12.3, 15.5);
		Subtraction(12.2, 15.4);
		
		System.out.println("This is Devission");
		divide(10, 0);
	
	
	
	}
	public static void Addition(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public static void multiplication(int a, int b ) {
		int multiplication = a*b;
		System.out.println(multiplication);
	}
	public static void Subtraction(double a, double c) {
		double Subtraction = a-c;
		System.out.println(Subtraction);
	}
	public static void divide(int a, int b) {	
		try {
			int result = a/b;
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("Can't divided by zero");
		}	
	}
}