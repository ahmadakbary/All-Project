package A_Aug_02_2021;

public class NestedIfStatements {
public static void main(String[] args) {
	
	
	int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
	
	num1 = 1;
	num2 = 2;
	
	num3 = 3;
	num4 = 4;
	
	num5 = 5;
	num6 = 6;
	
	num7 = 7;
	num8 = 8;
	
	num9 = 9;
	num10 = 10;
	
	if (num2 > num1) {
	if (num4 > num3) {
	if (num6 > num5) {
		System.out.println("Yes this is true");
	}
	if (num2>num1 && num4>num3 && num6>num5) {
		System.out.println("true");
	}
	}
	}
}
}
