package InterviewQuestions;
public class I_Q_ReverseString {
public static void main(String[] args) {
				
		String s = "I love Automation";
		System.out.println(revString(s));
		
		//StringBuffer word = new StringBuffer(s);
		//System.out.println(word.reverse());
}
	 public static String revString (String str) {
		 String [] text = str.split(" ");		 		 
		 String revers = "";
		 
		 for (int i = text.length-1; i>=0; i--) {
			 revers += text[i] + " ";
		 } 
		 return revers;
	 }
}
