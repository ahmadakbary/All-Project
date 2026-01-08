package BaseJava;

public class MethodOverloading {
public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	obj.M_Overloading(100, 300);
	obj.M_Overloading(3.99);
	obj.M_Overloading("Ahmad", "jj");
	
}
	public void M_Overloading(int a, int b) {
		System.out.println((a +" "+b));
		
}
	public void M_Overloading(double a) {
		System.out.println(a);
		
}
	public void M_Overloading(String a, String b ) {
		System.out.println(a+ " - "+ b);
		
	}
}
		
