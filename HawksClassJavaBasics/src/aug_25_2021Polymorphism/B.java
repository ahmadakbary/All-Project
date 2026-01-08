package aug_25_2021Polymorphism;
public class B extends A {

	private  int id;
	public B() {
		super();
		id = 0;
		}		
	public B(int id, String name, int age) {
		super(name, age);
		this.id = id;				
		}
	public void printInfo() {
		System.out.print("Class B: ID=" +id+" ");
		super.printinfo();			
		}
	public void someMethod() {
				
			}
		}

