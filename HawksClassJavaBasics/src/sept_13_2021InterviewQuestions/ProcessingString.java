package sept_13_2021InterviewQuestions;

import java.util.HashSet;

public class ProcessingString {
public static void main(String[] args) {
	
	String sample = "Fredom Mortgage";
	procesString(sample);
	System.out.println(processWord("Freedom"));
	
}
public static void procesString(String str) {
	String signs = str.replaceAll("[a-zA-Z]", "");
	String []words = str.split("" + signs.charAt(0));
	
	
	for (String s : words) {
		System.out.println(s);		
	}
	System.out.println(signs);				
	}
public static String processWord(String word) {
	HashSet<Character> tempHS = new HashSet<Character>();
	
	if (word == null || word.length()<2) {
		return word;
	}
	
	for (int i = 1; i < word.length()-1; i++) {
		tempHS.add(word.charAt(i));
	}
	System.out.println(tempHS.size());
	return "Word (" + word+"): "+ word.charAt(0) +4+ word.charAt(word.length()-1);
}
}

