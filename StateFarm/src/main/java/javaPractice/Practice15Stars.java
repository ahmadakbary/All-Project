package javaPractice;

public class Practice15Stars {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
			for (int a = 5; a >=0; a--) {
				for (int j2 = a; j2>0; j2--) {
					System.out.print("* ");		
				}
				System.out.println();
			}
		}
	}

