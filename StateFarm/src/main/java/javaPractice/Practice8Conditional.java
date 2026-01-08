package javaPractice;

public class Practice8Conditional {
	public static void main(String[] args) {
		
		double grade = 75.5;
		
		if (grade>=90 && grade<=100) {
			System.out.println("Grade is A");
		}else if(grade>=80 && grade<=90) {
			System.out.println("Grade is B");
		}else if (grade>=70 && grade<=80) {
			System.out.println("Grade is C");
		}else {
			System.out.println("You are failed.....");
		}
	}
}
