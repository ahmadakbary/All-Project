package aug_10_2021;
public class IsItPalindrom {
public static void main(String[] args) {	
	
	String word = "dad";
	String reverse = "";
	for (int i=word.length()-1; i >= 0; i--) {
	reverse = reverse + word.charAt(i);
	}	
System.out.println("word: " +word);
System.out.println("revser: "+reverse);
System.out.println(word.equals(reverse)? "Palindrome" : "Not Palindrome");
	
	

	}

}
