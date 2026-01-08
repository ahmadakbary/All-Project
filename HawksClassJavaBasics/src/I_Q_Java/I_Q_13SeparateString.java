package I_Q_Java;
public class I_Q_13SeparateString {
public static void main(String[] args) {
	
	//System.out.println((int)('a'+'b'));

	
	String s = "I love to be a QA";
	
	System.out.println(separateText(s));
}
public static String separateText(String str) {
	
	String [] word = str.split(" ");
	String revers ="";
	for (String s: word) {
		System.out.println(s);
	}
	return str;
	
}
}