package sept_16_2021InterviewQuestions;
public class ReverseIntegerQ1 {
public static void main(String[] args) {
	
	System.out.println(ReverseInteger(12345));
	}
// how do you reverse an int without using String
	public static int ReverseInteger(int num) {
		
		int rev = 0, temp = 0;	
		while ( num > 0) {
			temp = num % 10;
			rev = rev * 10 + temp;
			num /=10;
	}
		return rev;
	}
	
}
