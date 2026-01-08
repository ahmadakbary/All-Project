package OCA;

public class Q36 {

	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = str1;
		System.out.print(str1 == str2);
		System.out.println();
		System.out.print(str2);

	}
}
