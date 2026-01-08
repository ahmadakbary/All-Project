package sept_16_2021InterviewQuestions;
public class HowToRemoveVoweChars {
public static void main(String[] args) {
	
	String str = "this is a test to remove all of the vowel chars";
	System.out.println(removeAllVowelChars(str));	
}
public static String removeAllVowelChars(String str) {
	return str.replaceAll("[aeiou]", "");

}
public static int CountOfVowelsChars2(String str) {
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
		if ("aeiou".contains("" + str.charAt(i))) {
			count++;
		}
	}
		return count;
		
	}
	
}








