package Day9;
interface A{
	
		int a=10;
		void m1();	
}
public class Test implements A {
public void m1()	{
System.out.println("this is m1() method..");
	}
public static void main(String[] args) {
		//Test tobj=new Test();
		//tobj.m1();	
	A tobj=new Test();
	tobj.m1();
	}

}
