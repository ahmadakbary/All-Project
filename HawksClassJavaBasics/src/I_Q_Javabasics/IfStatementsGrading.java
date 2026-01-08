package I_Q_Javabasics;
public class IfStatementsGrading {
public static void main(String[] args) {
	
double grade = 85;
	
	if (grade >90) {
		System.out.println("Grade is A");
	}else if( grade> 80) {
		System.out.println("Grade is B");
		
	}else if( grade> 70) {
		System.out.println("Grade is C");
	}else if( grade> 60) {
		System.out.println("Grade is D");
		
	}else if( grade> 50) {
		System.out.println("Grade is E");
		
	}else {
		System.out.println("You are failed");
	}

	}

}
