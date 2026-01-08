package Day7;
public class StaticExample {

	static int a=10; //static variable
	int b=20;       //non-static variable
	
	static void m1() {// static method
System.out.println("this is m1() static m");
		}
	void m2() { //non-static method
System.out.println("this is m2() non-static m");
		}	
	void m3() {
System.out.println("*****m3() method starts");
System.out.println(a);
System.out.println(b);
m1();
m2();	
		}
	public static void main(String[] args) {	
m1();
System.out.println(a);
	
	StaticExample se=new StaticExample();
System.out.println(se.b);
se.m2();
se.m3();
	
	}

}
