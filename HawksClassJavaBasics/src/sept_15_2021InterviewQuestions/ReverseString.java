package sept_15_2021InterviewQuestions;
public class ReverseString {
public static void main(String[] args) {
	
	String sample = "I want to be a SDET Specialist";
	System.out.println(sample.charAt(5));		
	System.out.println(ReverseStringMethod1(sample));
	System.out.println(ReverseStringMethod2(sample));		
	
	String []	word = {"test1", "test2", "test3", "test4", "test5"};
}
	//first way to reverse the string
	public static String ReverseStringMethod1(String str	) {
		StringBuffer temp = new StringBuffer(str);
		return String.valueOf(temp.reverse());	
		
}	//second way to reverse the string
	public static String ReverseStringMethod2 (String str) {
		String rev ="";
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	
	}
	
	
}
