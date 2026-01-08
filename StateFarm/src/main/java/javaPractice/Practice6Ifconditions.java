package javaPractice;

public class Practice6Ifconditions {

	public static void main(String[] args) {
		
		int age = 21;
		if (age>20) {
			System.out.println("yes he can apply for loan");
			
		}else {
			System.out.println("not he can't apply for loan");
		}
		
		double grade = 90;
		if (grade > 90) {
			System.out.println("Student Grade is A");
		}else if(grade > 80) {
			System.out.println("Studend Grade is B");
		}else if (grade >70) {
			System.out.println("Student Grade is C");
		}else {
			System.out.println("Your score didn't met the requirements");
		}
	}
}
