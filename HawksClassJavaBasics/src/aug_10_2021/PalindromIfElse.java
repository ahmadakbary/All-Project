package aug_10_2021;
public class PalindromIfElse {
public static void main(String[] args) {
	
	String text = "book";
	String reverse = "";
			
	for (int i = text.length()-1; i >= 0; i--) {	
	reverse = reverse + text.charAt(i);
	}
	System.out.println("Text: "+text);
	System.out.println("reverse: "+reverse);
	System.out.println(text.equals(reverse)? "Palindrome " : "Not Palindrome");
	
	
	if (text.equals(reverse)) {
		System.out.println("the word is Palidrome");
	}else {
		System.out.println("the word is Not Palidrome");
	}
			}
	
}




