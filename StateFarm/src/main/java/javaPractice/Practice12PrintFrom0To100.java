package javaPractice;

public class Practice12PrintFrom0To100 {

	public static void main(String[] args) {
		
		System.out.println("from 0 to 10");
		for (int i=0; i<=10; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("from 10 to 0");
		for (int a=10; a>=0; a--) {
			System.out.print(a+ " ");
			
			char g = 'a';
			while(g<'z') {
				System.out.print(g++ +", ");
			}
		}
		System.out.println();
		System.out.println();
		for (int c=10; c<=17; c++) {
			System.out.print(c +" ");
			

		}
	
	}
}
