package aug_19_2021BankExample;
public class Runner {
public static void main(String[] args) {
		
	Address add1 = new Address("6201 Lessburg Pike","ste 216", "Falls Church", "VA","22543");
	Address sample2 = new Address("6201 Lessburg Pike","ste 216", "Falls Church", "VA","22543");	
	Customer x = new Customer("Jack", "David", 52, 101224444 , "12/12/1969", 2027546585, "somethingDavid@gmail.com", 
		                  add1, "Passworkd123", 10103201);

	System.out.println(x);
	x.deposit(159.99, "Password123");
	System.out.println(x);
	
	x.withdraw(55.99, "Password123");
	System.out.println(x);

	}

}
