package aug_31_2021Static;
public class Math {
public static void main(String[] args) {
	
	
	System.out.println(power(3,3));
	}
	public static double power(double a, double b) {
		double res = 1;
		for (int i = 0; i <b; i++) {
			res *=b;
			System.out.println(i+ " - "+res);
	}
			return res ;
	}

}
