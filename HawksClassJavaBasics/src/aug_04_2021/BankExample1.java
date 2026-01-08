package aug_04_2021;
public class BankExample1 {
public static void main(String[] args) {
		
double balance = 109;
double payment1 = 9;
	
int numOfPayment = 0;
while (balance > 0) {
		
if (balance - payment1 >0) {
	balance = balance - payment1;
}else {
payment1 = balance;
balance = balance - payment1;			
}
numOfPayment++;
System.out.println(numOfPayment +" "+ balance);
	}

	
}
}