package sept_16_2021InterviewQuestions;
public class HowToSwapTwoInteger {
public static void main(String[] args) {

//	System.out.println("/" + x / 10);
//	System.out.println("%" + x % 10);
	//how to you swap two integer without third variable
	int x = 10;
	int y = 5;
	
	x = x * y; // 50 // 10*5
	y = x / y; // 10 // 50/5
	x = x / y; // 5 // 50// 10
	System.out.println("X after swap \t"+ x);
	System.out.println("Y after swap \t"+y);
		
	x = x ^ y; 
	y = x ^ y; 
	x = x ^ y; 
	System.out.println("X after swap \t"+x);
	System.out.println("Y after swap \t"+y);
	
	x = 10;
	y = 5;
	
	x = x + y; //10 + 5 = x = 15
	y = x - y; //15 - 5 = y = 10
	x = x - y; //15 - 10 = x = 5
	System.out.println("X after swap \t"+x);
	System.out.println("Y after swap \t"+y);
	
	
}
}
