package aug_30_2021Abstractions;
public class CheckingAccount implements BankAccount, DataManagement {

	@Override
	public boolean deposit(double amount) {
		return false;
	}
	@Override
	public boolean wthdraw(double amount) {
		return false;
	}
	@Override
	public void printInfo() {

		
	}

}
