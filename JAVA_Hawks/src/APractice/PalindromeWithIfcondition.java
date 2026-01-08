package APractice;

public class PalindromeWithIfcondition {
	
	public static void main(String[] args) {
		
		
		
		String text = "teacher";
		String reverse = "";
		
		for (int i = text.length()-1; i>=0; i--) {
			reverse = reverse + text.charAt(i);
		}
		System.out.println(text);
		System.out.println(reverse);
		
		if (text.equals(reverse)) {
			System.out.println("it's Palindrome");
		}else {
			System.out.println("It's NOT Palindrome");
		}
	}

}
