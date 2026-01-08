package Aug_03_21;
public class NonStaticMethod {
public static void main(String[] args) {
	
	NonStaticMethod nonStaticM = new NonStaticMethod();
	 nonStaticM.addition1(10, 20);
	 nonStaticM.subtraction2(50, 25);
	 nonStaticM.multiplication3(2, 5);
	 nonStaticM.division4(10, 2);
} 
 public void addition1(int a, int b) {
	int sum = (a+b);
	System.out.println("Addition:\t sum of a & b is in NonStatic Method: "+sum);
}
public void subtraction2 (int a, int b) {
	int sum = a-b;
	System.out.println("Subtraction:\t sum of a & b is in NonStatic Method: "+sum);
}
public void multiplication3(double a, double b) {
	double sum = a*b;
	System.out.println("Multiplication:\t sum of a & b is in NonStatic Method: "+sum);		
}
public void division4(long a, long b) {
	long sum = a/b;
	System.out.println("Division:\t sum of a & b is in NonStatic Method: "+sum);
		

	}

}
