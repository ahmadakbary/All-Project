package I_Q_Java;
public class I_Q_11ReverString {
	public static void main(String[] args) {
	
		
		String s = "virginia";
		for (int i = s.length()-1; i>=0; i--) {
		System.out.print(s.charAt(i));

	}
		System.out.println();
		
		
		String text = "Test Automations";
		for (int i = text.length()-1;  i>=0; i--) {
			System.out.print(text.charAt(i));
		}
}
}