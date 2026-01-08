package july_28_2021;
public class LogicalGate {
public static void main(String[] args) {
// and or && logical gate example
	int age = 22;
	double creditScore = 750;
	boolean inDebt = true;
	if (age>21 && creditScore > 650) {
		System.out.println("&&-- Can apply for loan");
}
// or || only one side must be true for the result to be true
	if (age> 21 || creditScore >650) {
		System.out.println("OR-- Can apply for loan");	
}
// not ! is going to reverse the logic not is going to turn true to false and false to true
//!= not equal to
//if age is more than 21 and score is more than 650 and they are not inDebt
	if (age>21 && creditScore>650 && inDebt !=true)	
		System.out.println("Note -- can apply for loan"); 
		System.out.println(true);
		System.out.println(!true);// not true
		System.out.println("XOR: "+(true ^ false));
		System.out.println("XOR: "+(false ^ true));
		System.out.println("XOR: "+(false ^ false));
		System.out.println("XOR: "+(true ^ true));
}
}
