package APractice;
public class PalindromWithOutString {
public static void main(String[] args) {
		
		
		String text = "book";
		
for (int forward = 0, backword = text.length()-1; forward<text.length(); forward++, backword--) {
	if (forward == backword) {
		System.out.println("It's Palindrom");
		break;
	}
	if (text.charAt(forward)!=text.charAt(backword)) {
		System.out.println("It's Not palindrom");
		break;
		
	}
			
		}
}

}

