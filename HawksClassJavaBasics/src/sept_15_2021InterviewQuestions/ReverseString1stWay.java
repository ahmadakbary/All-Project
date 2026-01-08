package sept_15_2021InterviewQuestions;
public class ReverseString1stWay {
public static void main(String[] args) {
		
		String sample = "this is a test String";
		System.out.println(ReverseString(sample));		
}	
		public static String ReverseString(String str)	{	
			StringBuffer temp = new StringBuffer(str);
			return String.valueOf(temp.reverse()) ;
			
		
			
			
			
		}
	}


