package javaPractice;


public class Practice13Polidrom {
	public static void main(String[] args) {
		
	
		String word = "dad";
		String rev	= "";
		
		for (int i=word.length()-1; i>=0; i--) {
			rev = rev +word.charAt(i);
		}
		System.out.println("word " +word);
		System.out.println("rev " +rev);
		//System.out.println(word.equals(rev)? "Polindrom" : "Not Polindrom");

			if (word.equals(rev)) {
				System.out.println("P");
			}else {
				System.out.println("Not P");
			}
		
		}
	
	
}	