package Aug_05_21;
public class PrintEvenAndOddNumberBy_100 {
public static void main(String[] args) {

	for (int i = 0; i<=100; i++) {
		System.out.println(i);	
		
		if (i %2== 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		System.out.println();
	}
}
}
