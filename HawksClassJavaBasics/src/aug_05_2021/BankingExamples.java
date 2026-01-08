package aug_05_2021;
public class BankingExamples {
public static void main(String[] args) {
	
	double balance = 5500; //beginning balance
	double payment1= 300; // the amount I pay every cycle
		
int numberOfPayments = 0; // this is to keep track of the number of payment
	
while (balance > 0) { // I want to loop for as long as as my balance is more than zero
	numberOfPayments++; // every time that i pay, I increase the number of payment
	
if (payment1 > balance) {// if the payment I am going to make (300) is more than the balance I have
	payment1 = balance; // lets change the payment i have to pay to the current balance
	}	
System.out.println(numberOfPayments+ "=balance"+balance+" - "+payment1+" = "+(balance - payment1)+ " is the balance after payment");
balance = balance - payment1;// update the balance and deduct the payment that was made
	}
System.out.println(numberOfPayments);// print the number of payments made at the end.
		
		
		
	}

}
