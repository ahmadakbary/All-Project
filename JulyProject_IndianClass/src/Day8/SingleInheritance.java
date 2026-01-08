package Day8;

class A {
	int a;
	void display() {
	System.out.println(a);
	}
	}
class B extends A {
	int b;
	void print() {
	System.out.println(b);	
	}
	}
class C extends B{
	int c;
	void show() {
		System.out.println(c);
	}
	}
public class SingleInheritance {
public static void main(String[]args){
	
	A aobj=new A();
	aobj.a=100;
	aobj.display();
	
	B bobj=new B();
	bobj.a=10;
	bobj.b=20;
		
	bobj.display();
	bobj.print();
		
	C cobj=new C();
	cobj.a=10;
	cobj.b=20;
	cobj.c=30;
		
	cobj.display();
	cobj.print();
	cobj.show();
	
	}
}








