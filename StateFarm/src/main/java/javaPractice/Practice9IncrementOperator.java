package javaPractice;

public class Practice9IncrementOperator {
	public static void main(String[] args) {
		
		int x = 10;
		System.out.println(x);
		
		x = 1;
		System.out.println(x+1);
		System.out.println(x);
				
		int w = 5;
		int e = 10;
		w = e;
		e = w;
		System.out.println(10+e);
		System.out.println("________________________________");
		
		
		int j = 10; 
		System.out.println("J at start is "+j);
		System.out.println("J is pre increment "+ ++j);
		System.out.println("J is post increment "+ j++);
		System.out.println("J at the end is "+j);
		System.out.println("_______________________");
		
		int t = 18;
		System.out.println(t++ + --t);
	}
}
