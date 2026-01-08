package sept_14_2021InterviewQuestions;
import java.util.Stack;
public class IsBalancedQ {
public static void main(String[] args) {
			// ()()((()))
			// )(
			// (())	
	String sample =  "() () ((((()))))";
	System.out.println(IsBalanced(sample));
}
public static boolean IsBalanced (String str) {
		Stack<Character> charStack = new Stack<Character>();//Creating a stack
		for (int i = 0; i <str.length(); i++) {// going through all of the chars of the string
			if (str.charAt(i) == '(') {
				charStack.add(str.charAt(i));
			}else {// the char of this iteration is not an opening
				if(str.charAt(i) == ')') {// checking to see if the char is a closing
					if(charStack.size() == 0 ||charStack.pop()!= '(') {
						return false;
					}
				}
			}
		}
		return charStack.size() == 0;
	}

	}


