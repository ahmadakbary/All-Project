package javaPractice;

public class Practice4SIntegers {
	public static void main(String[] args) {
			
			int nbr = 10;
			System.out.println(nbr);
			System.out.println("--------------------");
			System.out.println("\n");
			addition(10, 10);
			System.out.println("--------------------");
			System.out.println("\n");
			subtraction();
			System.out.println("--------------------");
			System.out.println("\n");
			multiplication(12, 12.99);
			System.out.println("--------------------");
			System.out.println("\n");
			divission();
			
		}
		public static void addition(int a, int b) {
			System.out.println("sum of the a and b is..."+ (a+b));
			
		}
		public static void subtraction() {
			int ahmadAge = 20;
			int jamalAge = 11;
			
			if (ahmadAge>jamalAge) {
				System.out.println("Ahmad is older than jj");
			}else {
				System.out.println("jj is younger than Ahmad");
			}
		}
		public static void multiplication(int a, double c) {
			System.out.println("a is multiplied by c and the sum is..."+ (a*c));
			
			
		}
		public static void divission() {
		try {
			int a = 10;
			int b = 2;
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("cant devid 10 to 0 plz change your value on b varible");
				
			}			
}
}









