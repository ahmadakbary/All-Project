package javaPractice;

public class Practice10NonStaticMethods {
public static void main(String[] args) {
	Practice10NonStaticMethods ob=new Practice10NonStaticMethods();
	ob.subtraction(15, 5);
	ob.addition(15, 5);
	ob.multiplication(10, 5);
	ob.divission(10, 2);
	
			
}
		public void addition(int a, int b) {
			int subOfAddition = a+b;
			System.out.println(subOfAddition);
			
		}
		public void subtraction(int a, int b) {
			int sumOfSubt = a-b;
			System.out.println(sumOfSubt);			
}
		public void multiplication(int a, int c) {
			int sumOfMul = a*c;
			System.out.println(sumOfMul);
		}
		public void divission(int a, int b) {
			try {
				int sumOfDivissions = a/b;
				System.out.println(sumOfDivissions);
			}catch(Exception e) {
				System.out.println("Can't divide that value to zero");
			}

		}
		
}
