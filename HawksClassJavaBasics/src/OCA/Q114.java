package OCA;
public class Q114 {
	private static final int MIN = 0;

	public static void main(String[] args) {
		
		
		int x = args.length;
		if(checkLimit(x)) {
			System.out.println("Java SE");
		}else {
			System.out.println("Java EE");
		}
	}
	
	public static boolean checkLimit(int x) {
		return (x >=MIN) ? true:false;
	}
	
}
