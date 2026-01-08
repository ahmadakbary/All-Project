package APractice;
public class ReverseString {
public static void main(String[] args) {
	
	String s = "I love my teacher";
	System.out.println(ReveString(s));
	
}
	public static String ReveString (String str) {
		
		
		String [] text = str.split(" ");
		String reverse = "";
		
		for (int i = text.length-1; i>=0; i--) {
			reverse += text[i] + " ";
		}
	return reverse;
	
}
}

	