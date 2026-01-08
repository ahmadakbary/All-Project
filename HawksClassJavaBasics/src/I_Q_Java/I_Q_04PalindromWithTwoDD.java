package I_Q_Java;
public class I_Q_04PalindromWithTwoDD {
public static void main(String[] args) {

	String word = "maddam";
	
for (int forward = 0, backword = word.length()-1; forward<word.length(); forward++, backword--) {
if (forward == backword || forward > backword) {
 System.out.println("Palindrom");
 break;
 }
	if (word.charAt(forward)!=word.charAt(backword)) {
		System.out.println("Not Palindrom");
		break;
		
	}
}


	}

}
