package I_Q_Javabasics;
public class RationalOperator {
public static void main(String[] args) {

	int x = 10;
	int y = 10;
	System.out.println("Checking Retional Operator: " + (y>x));
	System.out.println("Checking Retional Operator: " + (y=x));
	
	System.out.println("checking relational operator:" +(+x<y));
	System.out.println("--------------------");
	
	// || or Operator
	// && AND operator
	// ! NOT operator
	if (x >= y && x == y) {
		System.out.println("the condition is true: ");
		if (x > y || x == y) {
			System.out.println("the condition is: ");
				
	System.out.println("true  || flase = "+(true  || false));
	System.out.println("false || flase = "+(false || false));
	System.out.println("true  || flase = "+(false || true));
			
	System.out.println("true  || true  = "+(true  && true));
	System.out.println("true  || flase = "+(true  && false));
	System.out.println("true  || false = "+(true  && false));
			
	System.out.println("!true || true  = "+(true  && true));
	System.out.println("!true || flase = "+(true  && false));
	System.out.println("!true || false = "+(true  && false));
			
	System.out.println("true ^ true  = "+(true  ^ true));
	System.out.println("true ^ flase = "+(true  ^ false));
	System.out.println("true ^ false = "+(true  ^ false));

	}

	}

}
}