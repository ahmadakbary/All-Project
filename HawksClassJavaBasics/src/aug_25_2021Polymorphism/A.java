package aug_25_2021Polymorphism;
public class A {

	private String name;
	private int age;
	
//static polymorphism - idea method overloading
	public A () {
		super();
		this.name = "";
		this.age = 0;	
	}
	public A (String name)	{
		this();
		this.name = name;
	}
	public A (int age) {
			
	}
	public A(String name, int age) {
		this(name);
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}
	public int getAge() {
		return age;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "A[name=" +name+",age="+ age +"]";	
	}
	public void printinfo()	{
		System.out.println(name + " "+age);
	}
//method overloading with the void
	public void printinfo(String title)	{
		System.out.println(title + ":" +name + " "+age);
	
	
}
}
