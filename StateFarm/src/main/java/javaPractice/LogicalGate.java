package javaPractice;

public class LogicalGate {

	public static void main(String[] args) {
		
		int age = 25;
		double creditScore = 750;
		boolean inDebt = true;
		
		if (age>21 && creditScore> 650) {
			System.out.println("&& Can apply for loan");
		
		if (age>21 || creditScore>650) {
			System.out.println("OR Can apply for loan");
		}
		if (age>21  && creditScore>650 &inDebt !=true) {
			System.out.println("Note Can apply for laond");
		}
		}
	}
}
