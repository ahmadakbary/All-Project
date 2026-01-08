package InterviewQuestions;
public class FizzBuzz {
public static void main(String[] args) {
		

	
	
	
	for (int i = 0; i<=100; i++) {
		
		if(i % 3 == 0 && i % 5 == 0) {
			System.out.println("TEKSchool");
		}else if (i % 5 == 0) {
			System.out.println("School");
		}else if (i % 3 == 0) {
			System.out.println("TEK");
		}else {
			System.out.println("fail");
		}
	}
	}

}
