package sept_13_2021InterviewQuestions;
public class I_Q_ReverseEachWordQ3 {
public static void main(String[] args) {

	
	//You are giving a string 
		// reverse the string based on the word
		//and reverse each word separately
		//jamil is a tester
		//limaj si a restset
		// tester a is jamil
		//retset a si limaj
	
	String s = "jamil is a tester";
	System.out.println(revEachWord(s));
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

}














