package sept_16_2021InterviewQuestions;
public class ReversIntegerQ3 {
public static void main(String[] args) {
		
	System.out.println(ReverseInteger(12345));
}
//how do you reverse an int without using String
public static int ReverseInteger(int x) {
	
	int rev = 0;
	//System.out.println("/" + x / 10); //everything beside the last digit
	//System.out.println("%" + x % 10); //it gives the last digit
	
for (; x != 0; x = x / 10) {
	int temp = x % 10;
	rev = rev * 10 + temp;	
}
	return rev;
}

}
