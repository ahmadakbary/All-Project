package Aug_09_21;

public class PalindromWIthIfCondition {
public static void main(String[] args) {
	
	 String word = "mom";
	 String reverse = "";
	 
	 for (int i = word.length()-1; i>=0; i--) {
		 reverse = reverse + word.charAt(i);
	 }
	 System.out.println(word);
	 System.out.println(reverse);
	 //System.out.println(word.equals(reverse)? "Palindrom": "Not Palindrom");
	 if (word.equals(reverse)) {
		 System.out.println("Palindrom");
	 }else {
		 System.out.println("Not Palindrom");
	
		 
	 }
	 
}
}
