package Aug_09_21;

public class Palindrom1 {
public static void main(String[] args) {
	
	
	String word = "teacher";
	String reverse = "";
	
	for (int i = word.length()-1; i>=0; i--) {
		reverse = reverse + word.charAt(i);	
	}
	System.out.println("Word: "+word);
	System.out.println("Reverse: "+reverse);
	//System.out.println(word.equals(reverse)? "Palindrom":"Not Palindrom");
	
	if (word.contains(reverse)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}

}
}
