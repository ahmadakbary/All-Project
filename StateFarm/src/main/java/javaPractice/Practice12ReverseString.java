package javaPractice;

public class Practice12ReverseString {
public static void main(String[] args) {
	
	
		String text = "testing";
		int i = text.length()-1;
		
		while (i>=0) {
			System.out.print(text.charAt(i--));
			System.out.println();
		}

		
		for (int a=0; a<=10; a++ ) {
			System.out.print(a + " ");
		}
}
}
