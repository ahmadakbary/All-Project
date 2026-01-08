package A_Aug_05_2021;

public class PalindromeReversString {
	
	public static void main(String[] args) {
		
		String word = "teacher";
		String revers = "";
		
		for (int i = word.length()-1; i>=0; i--) {
			revers = revers +word.charAt(i);
		}
			System.out.println("Word: "+word);
			System.out.println("Revers: "+revers);
			System.out.println(word.equals(revers)? "Palindrome":"Not Palindrome");
		
	}

}
