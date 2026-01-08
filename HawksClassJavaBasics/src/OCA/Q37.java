package OCA;

public class Q37 {
public static void main(String[] args) {
	
	Q37 ts = new Q37 ();
	System.out.print(isAvailable +" ");
	
	isAvailable = ts.doStuff();
			System.out.print(isAvailable);
	
}
public static boolean doStuff() {
	return !isAvailable;	
}
	static boolean isAvailable = false;
	
}

