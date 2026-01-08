package aug_25_2021Polymorphism;
public class C extends A{
	
	public void printInfo() {
		System.out.println("Class C: ");
		super.printinfo();
	}
	public void printOBJ(A obj) {
		System.out.println(obj);
	}
}
