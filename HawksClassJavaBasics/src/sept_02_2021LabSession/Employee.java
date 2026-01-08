package sept_02_2021LabSession;
public class Employee {

	//encapsulation
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String dob;
	
	//default constructor
	public Employee() { 
		super();
		this.firstName = "";
		this.lastName = "";
		this.userName = "";
		this.password = "";
		this.dob = "";
		
	}
	//parameterized constructor
	public Employee (String firstName, String lastName, String userName, String password, String dob)	{
		super ();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		
		
		
		
		
	}//getter
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", dob=" + dob + "]";
		
		
		
		
	}
	public String getFirstName() {
		return firstName;
		
	}//setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//getter
	public String getLastName() {
		return lastName;
		
	}//setter
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}//getter
	public String getUserName() {
		return userName;
	}//setter
	public void setUserName(String userName) {
		this.userName = userName;
		
	}//getter
	public String getPassword() {
		return password;
		
	}//setter
	public void setPassword(String password) {
		this.password = password;
		
	}//getter
	public String getDob() {
		return dob;
		
	}//setter
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
