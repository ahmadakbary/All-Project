package aug_23_2021Inheritance;
public class B extends A{
		
	private String address;
	private int phone;
	
	
	public B() {
		super();
	//local varibale
		this.address = "";
		this.phone = 0;
	}
	public B(String address, int phone) {
		super();
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
