package aug_24_2021Inheritance;
public class A {

	private String name;
	private int age;
	private int id;
	private boolean isAvailable;
	private char gender;
	
	public A() {
		this.name = "";
		this.age = 0;
		this.id = 0;	
		this.isAvailable = false;
		this.gender = ' ';
	}
	public A(String name, int age, int id) {
		this();
		this.name = name;
		this.age = age;
		this.id = id;		
	}
	public String getName() {
		return name;		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge()	{
		return age;
	}
	public void setAge(int Age) {
		this.age = age;
	}
	public int getID()	{
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
}









