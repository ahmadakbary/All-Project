package A_Aug_02_2021;
public class StaticMethods {
	public static void main(String[] args) {
		
		
		addition(1500, 1200);
		multiplication(12, 3);
		Subtraction(14, 2);
		divissionOfTwoDigit(100, 5);
		
		
	}
	public static void addition(int a, int b) {
		int addtionTotal = a +b;
		System.out.println("addition sum is \t..."+addtionTotal);
				
	}
	public static void multiplication(int a, int b) {
		int mulTotal = a*b;
		System.out.println("multiplication sum is \t..."+mulTotal);
		
	}
	public static void Subtraction(int a, int b) {
		int subTraction = a-b;
		System.out.println("subtraction sum is \t..."+subTraction);
		
	}
	public static void divissionOfTwoDigit(int a, int b	) {
		int division = a/b;
		System.out.println("division sum is \t..."+division);
		
	}
}
