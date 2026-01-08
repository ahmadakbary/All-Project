package InterviewQuestions;

public class forLoop {

	public static void main(String[] args) {
		
		
		int [] data = {23,5,34,23,2,34,2,34,5,3,2,4,5,3,4,5,3,3};
		
		System.out.println("forLoop:------------------");
		for (int i = 0; i<data.length; i++) {
			System.out.print(data[i]+ " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("foreach Loop: -------------------");
		for (int s: data) {
			System.out.print(s+ " ");
		}
		System.out.println();

	}

}
