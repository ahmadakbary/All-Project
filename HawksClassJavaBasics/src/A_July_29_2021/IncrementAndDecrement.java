package A_July_29_2021;

public class IncrementAndDecrement {
public static void main(String[] args) {
	
	
	int x = 1;
	x++;
	System.out.println(x);
	System.out.println(x+1);
	
	int NumberOfMyPhones = 1;
	int NumberOfYourPhones = 1;
	System.out.println(NumberOfMyPhones+NumberOfYourPhones);
	System.out.println("***************************************");
	
	int y = 1;
	System.out.println(y+1);
	System.out.println(y);
	
	int z = 6;
	z++;
	z--;
	System.out.println(z);
	System.out.println("****************************************");

	int w = 2;
	System.out.println(w+1);
	w = w  +1;
	System.out.println(++w);
	System.out.println("here is w "+w );
	System.out.println("****************************************");
	
	int j = 10;
	System.out.println("J at start is "        +    j);
	System.out.println("J pre incremnt is      "+ ++j);
	System.out.println("J at post increment is "+ j++);
	System.out.println("J at post incerment is "+ j++);
	System.out.println("J at the end is        "+   j);
	System.out.println("***************************************");
	
	int t = 18;
	System.out.println(t++ + --t + t);
	
	int a = 18;
	int b = 18;
	int e = 18;
	int c =a+b+e;
	System.out.println(c);
	
}
}
