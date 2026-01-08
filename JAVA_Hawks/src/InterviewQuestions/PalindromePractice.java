package InterviewQuestions;

public class PalindromePractice {
public static void main(String[] args) {
	
	
	
	String text = "bob";
	String revers = "";
			
	for (int i = text.length()-1; i>=0; i--) {
	revers = revers +text.charAt(i);
				
	}
	System.out.println(text);
	System.out.println(revers);
	System.out.println(text.equals(revers)? "Palindrome": "NOT Palindrome");
			
		if (text.equals(revers)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("NOT Palindrome");
			
	for (int start = 0, end = text.length()-1; start<text.length(); start++, end--) {
		if (start == end) {
			System.out.println("Palindrome without String");
			break;
		}
		if (text.charAt(start)!=text.charAt(end)) {
			System.out.println("NOT Palindrome without String");
			break;
		}
	}
		}
		
}
}
