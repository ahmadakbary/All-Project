package APractice;

public class Palindrome {
	
	public static void main(String[] args) {
		
		
		String text = "mom";
		String reverse = "";
		
		for (int i = text.length()-1; i>=0; i--) {
			reverse = reverse + text.charAt(i);
		}
		
		System.out.println(text);
		System.out.println(reverse);
		System.out.println(text.equals(reverse)?"It's Palindrom": "It's NOT Palindrome");
	}

}
