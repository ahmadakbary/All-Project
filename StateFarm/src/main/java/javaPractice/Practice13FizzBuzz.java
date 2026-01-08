package javaPractice;

public class Practice13FizzBuzz {

	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			
			if (i%3 == 0 && i%5 ==0) {
				System.out.println("TEKSCHOOL");
			}else if(i%5==0) {
				System.out.println("SCHOOL");
				System.out.println();
			}else if (i%3==0) {
				System.out.println("TEK");
			}else {
				System.out.print(i);
			}
			
		}
	}
}
