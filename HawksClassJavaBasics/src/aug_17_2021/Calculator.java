package aug_17_2021;
public class Calculator {

public double getsum(double a, double b) {
System.out.println(a+ " + "+b+ " = " + (a*b));
	return a + b ;
	}
public double getDiv(double a, double b) {
	if (b ==0 ) {
	System.out.println("Can not divided by Zero");
			return -1;
} else {
	System.out.println("Can be divided by Zero");
	System.out.println(a+ " / "+b+ "="+(a/b));
	return a/b;
	}
	}
public double getMult(double a, double b) {
	System.out.println(a+ " * "+b+ " = "+(a*b));
	return a * b;
	}
public double getSubtraction(double a, double b) {
	System.out.println(a+ " - "+b+ " - "+ (a-b));
	return a - b;
	}

}
