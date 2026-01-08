package aug_30_2021Abstractions;
public class SavingAccount extends Reporting implements BankAccount {
	
	public static void main(String[] args) {
		SavingAccount obj = new SavingAccount();
		obj.someMethod();	
	}
	@Override
	public boolean deposit(double amount) {
		return false;
	}
	@Override
	public boolean wthdraw(double amount) {	
		return false;
	}
	@Override
	public void someAbstractMethod() {
	
		
	}

}
