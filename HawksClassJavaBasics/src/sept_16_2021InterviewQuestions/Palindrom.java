package sept_16_2021InterviewQuestions;
public class Palindrom {
public static void main(String[] args) {
	
	String palindrom = "book";
	System.out.println(IsPalindrome(palindrom));
}
	public static boolean IsPalindrome(String str) {
		String rev = "";
		for (int i = str.length()-1;  i>=0; i--) {
			rev += (str.charAt(i));		
		}
		System.out.println(str +" === "+ rev);
		return str.equals(rev);
	}

}
