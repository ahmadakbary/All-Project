package aug_19_2021BankExample;
public class Customer {
	
	//Personal info
	
	String firstName;
	String lastName;
	int age;
	int ssn;
	String dob;
	int phone;
	String email;
	Address add;
//checking account number and password
	int checkingAccNum;
	String checkingPass;
	
	//balance
	double balance;
		
	//we need address
	public Customer() {
		firstName = "";
		lastName = "";
		age = 0;
		ssn = 0;
		dob = "";
		phone =0;
		email = "";
		add = new Address();
// checking account # and pass
		checkingPass = "";
		checkingAccNum = 0;
		balance = 0;
	}	
//Parameterized constructor
public Customer(String newFirstName, String newLastName, int newAge, int newSSN, String newDOB, int phoneNumber, 
				        String newEmail, Address newAdd, String newAccountPass,int  newCheckingAccNum) {
		firstName = newFirstName;
		lastName = newLastName;
		age = newAge;
		ssn = newSSN;
		dob = newDOB;
		phone = phoneNumber;
		email = newEmail;
		add = newAdd;
		// checking account # and pass
		checkingPass = newAccountPass;
		checkingAccNum = newCheckingAccNum;
		}
//toString method so we can print the values of the a customer object the way we want
	public String toString() {
	String strSSN = ""+ssn;
	String strPhone = "" +phone;
	String formatedSSN = strSSN.substring(0,3)+ "-"+ strSSN.substring(3,5)+"-"+ strSSN.substring(5,9);
//String formatedPhone =  strPhone.substring(0,3)+ "-"+ strPhone.substring(3,6)+"-"+ strPhone.substring(6,10);
	String formatedPhone = "+1("+strPhone.substring(0,3)+ ")"+ strPhone.substring(3,6)+"-" +strPhone.substring(6,10);
		
	return "**************************************\n"+ "Customer: "+firstName+" "+lastName+","
			+ "SSN:"+formatedSSN+"\n" + "Age: "+age+" ,Date of Birth: "+dob+" \n"
			+ "Phone: " +formatedPhone+", Email:"+email+"\n"
		    + add +"\n--------------------------------\n"
			+ "Cecking Account Number: " +checkingAccNum+", Password" +checkingPass+ "\n"
			+ "Current Balance: $" +balance 
			+  "\n*********************************************\n";
		}	
//create a method deposit that will add some balance to the user	
	public boolean deposit(double amount, String pass) {
		// lets compare the pass and see if it match user pass
		if (checkingPass.equals(pass)) {
		// if the password matches and we want to perform the deposit
				balance +=amount;
				System.out.println("Deposit: the amount of $" +amount+ "has been added to your account successfully");
	return true;
		}else {
			System.out.println("Deposit: the password provided does not match. Deposit failed");
			return false;
	}
	}
		//create a method with draw that will deduct some balance from the user
	public boolean withdraw(double amount, String pass) {
		if (checkingPass.equals(pass)) {
			// if the password matches and we want to perform with draw
		if (amount > balance) {
			System.out.println("Withdraw: Amount request $" + amount+" is more than you have available $" +balance+". with draw failed");
			return false;
		}else {
		// tje a,pim requested is less than or equal to the balance we have available
		double balBeforDeduction = balance;
			balance-=amount;
System.out.println("withdraw: The amount of $ "+amount+" has been deducted on your balance($"+balBeforDeduction+"). Your current balance is $"+balance);
		return true;
		}	
	}else {
		System.out.println("Withdrwa: the password provided does not match. withdraw failed");
		return false;
	}
		

		}
}





















