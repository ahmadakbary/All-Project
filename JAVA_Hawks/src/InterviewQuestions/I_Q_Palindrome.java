package InterviewQuestions;

public class I_Q_Palindrome {

	public static void main(String[] args) {
		
		
		String text = "book";
		String revers = "";
		
		
for (int j = text.length()-1; j>=0; j--) {
	revers = revers + text.charAt(j);
}
	System.out.println(text);
	System.out.println(revers);
	System.out.println(text.equals(revers)?"Its Palindrom": "Its Not Palindrom");
			
			
		
	}
}
