package I_Q_Java;
public class I_Q_01Palindrome {
public static void main(String[] args) {	
		
		String text = "mom";
		String revers = "";
				
for (int i = text.length()-1; i>=0; i--) {
	revers = revers + text.charAt(i);
	}
	System.out.println(text);
	System.out.println(revers);
	System.out.println(text.equals(revers)?"Its Palindrom": "Its Not Palindrom");
			
			
		
	}
}
