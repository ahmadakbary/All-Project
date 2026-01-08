package AccessMofifiers;
public class PrivateModifiers {
	
	private int a=50;
	private int b=40;
	private int i=a*b;
public static void main(String[] args) {
}
	private void privatemodifiers() {	
		System.out.println("this is private modifiers");	
	}
	public void calldatahidding() {
		System.out.println("this is called from priviate access modifiers");
		privatemodifiers();		
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	System.out.println(this.i);
		
	}	
}
