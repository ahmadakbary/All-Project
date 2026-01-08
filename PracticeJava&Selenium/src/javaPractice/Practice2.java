package javaPractice;
public class Practice2 {
	public static void main(String[] args) {
		


		try {
			
		
		
		int a = 10;
		int b = 2;
		int c =a/b;
		System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("10 can't be divided by 0 -  please change b value");
			
		}
}
}