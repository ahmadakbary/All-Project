package OCA;

public class Q149 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		if(x++ <++y) {
			System.out.print("Hello ");
		}else {
			System.out.println("Welcome");
		}
		System.out.println("Log "+x+ ":" +y);
		
		/*
		 if (x++ < ++y)

				x++ → post-increment:
				
				The value of x++ is 1 (used in comparison).
				
				After the comparison, x becomes 2.
				
				++y → pre-increment:
				
				y is first incremented, so y becomes 2.
				
				The value of ++y is 2 (used in comparison).				 
		 */
		
		
	}
	
}
