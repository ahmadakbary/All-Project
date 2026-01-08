package javaPractice;

public class Practice12Banking {
public static void main(String[] args) {
	
	
		double balance = 5500;
		double payment1 = 300;
		
		int numberOfPayments = 0;
		while (balance>=0) {
			numberOfPayments++;
			
			
	if (payment1>balance) {
		payment1 = balance;
	}
	System.out.println(numberOfPayments+ "balance" +balance+ " = " +(balance - payment1)+" is the balance after payment");
	balance = balance - payment1;
	
		}
		System.out.println(numberOfPayments);
}
}
