package A_Aug_04_2021;

public class BankingExample {
public static void main(String[] args) {
	
	double balance = 100;
	double payment1 = 9;
	
	int numOfPayment = 0;
	while (balance > 0) {
		
	if (balance  - payment1>0) {
		balance = payment1 - payment1;

		
	}else {
		payment1 = balance;
		balance = balance - payment1;	
	}
	numOfPayment++;
	System.out.println(numOfPayment+" "+balance);
	
}

}
}