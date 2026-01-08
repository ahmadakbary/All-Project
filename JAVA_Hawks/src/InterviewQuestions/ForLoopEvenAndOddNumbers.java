package InterviewQuestions;
public class ForLoopEvenAndOddNumbers {
public static void main(String[] args) {
		
		
		for (int i = 0; i<=100; i+=2) {
			System.out.println(i);
			
		if (i % 2 ==0) {
			System.out.println(i + "It's Even number");
		}else {
			System.out.println(i+ "It's Odd number");
		}
		}

	}

}
