package sept_13_2021InterviewQuestions;
public class FactorialExample {
public static void main(String[] args) {

	System.out.println(getFactorail(5));
	System.out.println(getFactorail2(5));
	System.out.println(getFactorail3(5));		
	}
public static int getFactorail(int n) {		
		int temp = 1;
		// 3*2*1
		for (int i = 0; i<=3; i++) {
			temp *= n;
			n--;		
	}
		return temp;
	}
public static int getFactorail2(int n) {	
		int temp = 1;
		// 3*2*1
		while(n>0) {
			temp *= n--;	
	}
		return temp;
	}
public static int getFactorail3(int n) {
		int temp = 1;
		// 3*2*1
		if (n==0) {		
	}
		if (n == 1) {
			return 1;
	}	
		return n* getFactorail(n-1);
}

}