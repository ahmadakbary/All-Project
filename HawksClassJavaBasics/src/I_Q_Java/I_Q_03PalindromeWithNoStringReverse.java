package I_Q_Java;
public class I_Q_03PalindromeWithNoStringReverse {
public static void main(String[] args) {
			
	String word = "bob";
			
for (int forward = 0, backword = word.length()-1; forward<word.length(); forward++, backword--) {
	if (forward == backword) {
		System.out.println("Palindrome");
		break;
	}
	if (word.charAt(forward)!=word.charAt(backword)) {
		System.out.println("Not Palindrome");
		break;
			}			
		}
	}

}
