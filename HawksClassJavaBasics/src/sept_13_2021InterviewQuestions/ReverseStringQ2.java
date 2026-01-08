package sept_13_2021InterviewQuestions;
public class ReverseStringQ2 {
public static void main(String[] args) {
//You are giving a string reverse the string based on the word
	//and reverse each word separately
	//jamil is a tester
	//limaj si a restset
	// tester a is jamil
	//retset a si limaj
			String s = "jamil is a tester";
			System.out.println(revWord(s));
	        System.out.println("the String\t\t" +s);
	StringBuffer sb = new StringBuffer(s);
	System.out.println("Complete reverse\t"+ sb.reverse());
	System.out.println("reverse each word\t" +revEachWord(s));
	System.out.println("------------------------------------------");		
	System.out.println(revEachWord("str is the name of the variable in the method"));
	
}			
public static String revEachWord(String str) {
	String [] words = str.split(" ");
	String tempRev = "";
	String revWord = "";
		for (int i = 0; i <words.length; i++) {
			revWord = "";			
		for (int j = words[i].length()-1; j>=0; j--	) {
			revWord += words[i].charAt(j);		
			}
			tempRev += revWord + " ";
			}
			return tempRev;
}
public static String revWord(String str) {
	String [] words = str.split(" ");
	String rev = "";				
		for (int i = words.length -1; i>=0; i--) {
		rev += words[i] + " ";
}
	return rev;
		
	}
	
	
	
	
	}

