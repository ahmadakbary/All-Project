package JavaFullClass;
public class LocalVariable {
public static void main(String[] args) {
	
	 LocalVariable ahmad=new LocalVariable();
	 ahmad.addition();
	 ahmad.subtractions();
	 ahmad.multiplications();
}
	public void addition() {
		int d=60;
		int t=80;
		int u=d+t;
		System.out.println(u);
	
	}
public void subtractions() {
		int d=60;
		int t=80;
		int u=d-t;
		System.out.println(u);
	}
public void multiplications() {	
		int d=60;
		int t=80;
		int u=d*t;
		System.out.println(u);
}
}