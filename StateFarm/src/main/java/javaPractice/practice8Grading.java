package javaPractice;

public class practice8Grading {

	public static void main(String[] args) {
		
		double grade = 70;
		String s =  "The Student is ";
		s+= (grade>60) ? "passing" : "failing";
		System.out.println(s);
	}
}
