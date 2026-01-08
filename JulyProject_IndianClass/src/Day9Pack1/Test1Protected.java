package Day9Pack1;
public class Test1Protected{
	protected int x=100;
	protected void m1() {
	System.out.println(x);	
	}
	void m2() {
	System.out.println(x);	
		m1();
	}

}
