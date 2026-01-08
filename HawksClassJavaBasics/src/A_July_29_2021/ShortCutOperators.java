package A_July_29_2021;

public class ShortCutOperators {
public static void main(String[] args) {
	
	
	int x = 10;
	x = 1;
	System.out.println(x+1);
	System.out.println(x);
	
	int w = 5;
	int e = 10;
	w = e;
	e = w;
	System.out.println(10+e);
	
	int x1 = 5;
	double y = 2.0;
	int z = 3;
	double j = x1/y+z;
	x1 = (int) j + z;
	y = z * x1; 
	System.out.println("this is the end value of x "+ x1);
	System.out.println("this is the end value of y "+y);
	System.out.println("this is the end value of z "+z);
	System.out.println("this is the end value of j "+j);
}
}
