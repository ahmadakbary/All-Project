package aug_10_2021;
public class PalindromeWithOutUsingReverseString {
public static void main(String[] args) {
		
String word = "madam";
String reverse = "";
		
	for (int i = word.length()-1; i>=0; i--) {
		reverse = reverse+ word.charAt(i);
	}	
	System.out.println("Word: "+word);
    System.out.println("Reverse: "+reverse);
	System.out.println(word.equals(reverse)? "It's Palindrome" : "It's not Palindrome");
			
	if (word.equals(reverse)) {
	System.out.println("the word is Palindrome");
			
	}else {
	System.out.println("the word is not Palindrome");
	}
	for (int forward = 0, backword = word.length()-1; forward<word.length(); forward++, backword--) {
	if (forward == backword) {
	System.out.println("Palindrome Without reverse stirng");
	break;
}
	if (word.charAt(forward)!= word.charAt(backword)) {
	System.out.println("Not Palindrome");
	break;
				
			}
		}
	}

}
