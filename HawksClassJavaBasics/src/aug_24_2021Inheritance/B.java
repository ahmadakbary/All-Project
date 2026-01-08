package aug_24_2021Inheritance;
public class B extends A{
	
	private String address;
	private int phone;
	
//the job of the constructor is to initialize the variable of the class
// we have three variables in A class and two in B class & we inherite 3 variable from A into B class 
	public B() {
		super();
	//local variable
		this.address = "";
		this.phone = 0;
	}
	public B(String address) {
		this();
		this.address = address;		
	}
	public B(String name, int age, int id, String address, int phone ) {
		this(address);
		//super(name, age, id);
		this.address = address;
		this.phone = phone;	
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	

}
