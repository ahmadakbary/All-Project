package aug_30_2021Abstractions;
public interface BankAccount {
	
	public boolean deposit(double amount);
	public boolean wthdraw(double amount);
	

	public static double max (double a, double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}

}
