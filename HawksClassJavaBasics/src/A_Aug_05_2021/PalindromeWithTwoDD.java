package A_Aug_05_2021;

public class PalindromeWithTwoDD {
public static void main(String[] args) {
	
	
	String word = "maddam";
	String revers = "";
	
	for (int i = word.length()-1; i>=0; i--) {
		revers = revers +word.charAt(i);
	}
	System.out.println("word: "+word);
	System.out.println("revers: "+revers);
	System.out.println(word.equals(revers)? "It's Palindrome": "It's not Palindrome");
	
	if (word.contains(revers)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	for (int forword = 0, backword = word.length()-1; forword<word.length(); forword++, backword--) {
		if (forword == backword || forword>backword) {
			System.out.println("Palindrome without String");
			break;
		}
		if (word.charAt(forword)!=word.charAt(backword)) {
			System.out.println("Not Palindrome");
			break;
		}
	}
}
}
