package InterviewQuestions;

public class I_Q_ReverseStringg {

	public static void main(String[] args) {
		String s = "I love automation";
		int len = s.length();
		String reverse = "";
	
		
		for (int i =len-1; i>=0; i-- ) {
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}

}
