package I_Q_Java;
public class I_Q_02PalindromeWithIfCondition {
public static void main(String[] args) {
	
	String word = "bob";
	String revers = "";
	
	for (int i = word.length()-1; i>=0; i--) {
		revers = revers + word.charAt(i);
	}
	System.out.println("word: "+word);
	System.out.println("revers: "+revers);
	//System.out.println(word.equals(revers)? "it's palindrome":"it's not palindrome");

	if (word.equals(revers)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
		
}
}
