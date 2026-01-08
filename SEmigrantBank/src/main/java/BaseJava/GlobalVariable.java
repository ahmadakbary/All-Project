package BaseJava;
public class GlobalVariable {
	
	int a ;
	int b ;
	int c;
	
	public static void main(String[] args) {
		GlobalVariable obj = new GlobalVariable();
		obj.globalVariable();	
	}
	public void globalVariable() {	
		a = 200;
		b = 5;
		c = a+b;
		System.out.println(c);
	}
}
