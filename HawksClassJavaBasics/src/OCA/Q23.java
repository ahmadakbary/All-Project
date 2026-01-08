package OCA;

public class Q23 {
public static void main(String[] args) {
	
	
	int x = 100;
	int a = x++;
	int b = ++x;
	int c = x++;
	
//	System.out.println("a is = " +x);
//	System.out.println("b is = " +b);
//	System.out.println("c is = " +c);
	
	
	int d = (a<b) ? (a<c) ? a: (b<c)? b: c: x;
	System.out.println("d is = "  +d);
}
}
