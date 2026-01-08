package A_Aug_05_2021;

public class ForLoopValidationOddNumbers {
	public static void main(String[] args) {
		
		for (int i=0; i<=100; i++) {
			if (i % 2 == 0) {
				System.out.println(i+ " is Odd Numbers");
			}else {
				System.out.println(i+ " is Even Numbers");
			}
		}
	}

}
