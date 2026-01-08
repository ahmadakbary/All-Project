package A_Aug_05_2021;
public class FelowOfExecution {
public static void main(String[] args) {
	
	
	for (int i=0; i<=100; i++) {
		
		if (i % 3 ==0 && i % 5 ==0) {
			System.out.println("TEKSCHOOL");
		}else if (i % 5 == 0) {
			System.out.println("SCHOOL");
		}else if (i % 3 == 0) {
			System.out.println("TEK");
		}else {
			System.out.println();
		}
	}

	}

}
