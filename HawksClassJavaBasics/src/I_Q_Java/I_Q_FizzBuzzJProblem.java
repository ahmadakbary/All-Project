package I_Q_Java;
public class I_Q_FizzBuzzJProblem {
public static void main(String[] args) {
	
	for (int i =0; i<=100; i++) {
				
		if ( i %3 == 0 && i %5 == 0) {
			System.out.println("TEKSCHOOL");			
		}else if (i % 5 == 0) {
			System.out.println("School");
		}else if (i % 3 == 0) {
			System.out.println("TEK");
		}else {
			System.out.println();
		}
	}
	
}
}
