package Day8;

class XYZ{
	void m1() {
System.out.println("this is m1().......");
	}
	}
class ABC extends XYZ{ //final keyword can't use in childclass
	void m1() {
System.out.println("this is m1() modified here.......");
	}
	}
public class FinalMethod {
public static void main(String[] args) {
	
		XYZ m=new XYZ();
		m.m1();
		

	}

}
