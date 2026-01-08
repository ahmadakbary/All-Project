package Aug_04_21;

public class bankingExampl {
public static void main(String[] args) {
	
	
	double balance = 109;
	double payment1 = 9;
	int numberOfPayment = 0 ;
	
	if (balance>0) {
		balance = balance - payment1;
	
	}else {
		payment1 = balance;
		balance = balance - payment1;
	}
	balance++;
	System.out.println(numberOfPayment + " "+balance);
}
}
