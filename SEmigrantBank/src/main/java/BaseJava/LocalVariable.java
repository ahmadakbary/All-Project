package BaseJava;
public class LocalVariable {
public static void main(String[] args) {
	LocalVariable obj = new LocalVariable();
	obj.additions();
	obj.casting();
	obj.divission();
	obj.subtraction();
	obj.multiplication();
	
	
}


public void additions() {
		double a = 100.99;
		int    b = 200;	
		System.out.println("addition" +a+b);
}
	public void casting() {
		
		char   a = 'a';
		char   b = 'b';
		System.out.println("this is Accsi cart" +(int)a+b);
	}
	public void multiplication() {
		int a = 100;
		int b = 2;
		int c =  a+b;
		System.out.println("Multiplicaitons" +c);
	}
	public void subtraction() {
		int a = 100;
		int b = 2;
		int c =  a+b;
		System.out.println("subtractions" +c);
	}
	
	public void divission() {
		int a = 100;
		int b = 2;
		int c =  a/b;
		System.out.println("Divission" +c);
	}
}

