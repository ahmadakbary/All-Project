package InterviewQuestions;
public class I_Q_PalindromeWithOutString {
public static void main(String[] args) {
	
	
	
	
	
	String palindrome = "bob";
	String revers = "";
	
	for (int i = palindrome.length()-1; i>=0; i--) {
		revers = revers + palindrome.charAt(i);
	}
	System.out.println(palindrome);
	System.out.println(revers);
	System.out.println(palindrome.equals(revers)? "It's Palindrome": "It's NOT Palindrome");
		
//Reverse String without using String in Palindrome
	
	if (palindrome.equals(revers)) {
		System.out.println("It's Palindrome");
	}else {
		System.out.println("It's NOT Palindrome");
	}
	for (int forward = 0, backword = palindrome.length()-1; forward<palindrome.length();forward++, backword--) {
	if (forward == backword) {
		System.out.println("Palindrome without String");
		break;
	}
	if (palindrome.charAt(forward)!=palindrome.charAt(backword)) {
		System.out.println("Not Palindrome");
		break;
	}
	}

}
}