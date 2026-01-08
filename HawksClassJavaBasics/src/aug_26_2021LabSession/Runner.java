package aug_26_2021LabSession;
public class Runner {	
public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setFirstName("Omar");
		obj.setlastName("Jani Padar");
		obj.setAge(9);
		
		System.out.println("FirstName: "+obj.getFirstName());
		System.out.println("LastName: "+obj.getlastName());
		System.out.println("My age is: " +obj.getAge());
	}
}
