package OCA;

public class Q173 {
public static void main(String[] args) {
	
	
	int x = 6;
	while (isAvailable(x)) {
		System.out.print(x);
		// add --x at the sysout
	}
}
public static boolean isAvailable(int x) {
	return --x >0 ? true : false;
}
}
