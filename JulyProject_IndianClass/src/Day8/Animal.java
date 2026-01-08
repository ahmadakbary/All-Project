package Day8;
public class Animal {
	String  color="white";
	
void eating(){
	System.out.println("eating..");
}
}
class Dog extends Animal{
	String color="black";
	void eating() {
System.out.println("Eating bread..");
	super.eating();
	}
	void displaycolor() {
	System.out.println(super.color);
	System.out.println(color);
	}
}


