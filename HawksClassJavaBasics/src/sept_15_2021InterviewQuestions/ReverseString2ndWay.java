package sept_15_2021InterviewQuestions;
public class ReverseString2ndWay {
public static void main(String[] args) {
		
	
		String sample = "this is a test String";
	System.out.println(ReverseString2nWay(sample));
	System.out.println(ReversedString2ndWay(sample));
}
	public static String ReverseString2nWay(String str) {
		StringBuffer temp = new StringBuffer (str);
		return String.valueOf(temp.reverse());
	
		
		
		
		
		
	}
	public static String ReversedString2ndWay(String str) {
		String rev = "";
		
		 for (int i = str.length()-1; i>=0; i--) {
			 rev = rev + str.charAt(i);
			
		}
		
		return rev;
		
	}
}
