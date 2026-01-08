package sept_16_2021InterviewQuestions;
import java.util.Stack;
public class ReverseIntegerQ2 {
public static void main(String[] args) {
		
System.out.println(ReversInteger(12345));//printing it
}
	public static int ReversInteger(int num	) {
		int temp = 0;
		Stack<Integer> tempStack = new Stack<>();	
			while (num != 0){
				tempStack.add(num % 10);
				num /= 10;
				temp = temp * 10 + tempStack.pop();			
		}
		return temp;
		
	}

}
