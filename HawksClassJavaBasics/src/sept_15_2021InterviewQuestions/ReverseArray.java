package sept_15_2021InterviewQuestions;
public class ReverseArray {
public static void main(String[] args) {
	
	String []	word = {"test1", "test2", "test3", "test4", "test5"};
	for (String s: ReverseArray(word)) {
		System.out.println(s);
}
}
	public static String[] ReverseArray(String [] str) {
	String [] temp = new String [str.length];
	int x = 0;
		for (int i = str.length-1; i>=0; i--) {
			temp[x++] = str[i];							
		}
			return temp;
	
}
}