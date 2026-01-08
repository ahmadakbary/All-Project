package JavaFullClass;
public class GlobalVarible {
		int d=60;
		int t=80;
		int u;
	
	public static void main(String[] args) {
		GlobalVarible ahmad=new GlobalVarible();
		ahmad.addition();
		ahmad.subtraction();
		ahmad.multiplication();
	}
	public void addition() {
		int t=100;
		int c=100;
		int localVarible=t+c;
		u=d+this.t;
		System.out.println(u);
		System.out.println(localVarible);
	}
	public void subtraction() {
		u=d-t;
		System.out.println(u);
	}
	public void multiplication() {
		u=d*t;
		System.out.println(u);
	}		
	}

