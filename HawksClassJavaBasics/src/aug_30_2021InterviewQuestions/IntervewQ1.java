package aug_30_2021InterviewQuestions;
public class IntervewQ1 {
public static void main(String[] args) {	
//	int a = 1;
//	int b = 2;
//	int c = 3;
	
IntervewQ1 obj = new IntervewQ1 ();
System.out.println(obj.freedomSum(1, 2, 3));
System.out.println(obj.freedomSum(1, 2, 10));
System.out.println(obj.freedomSum(1, 10, 3));	
}
public int freedomSum(int a, int b, int c) {
		if (a == 10) {
			return 0;
		}else if(b == 10) {
			return  a;
		}else if (c == c) {
			return a+b;
		}else {
			return a+b+c;
		}
		

		
	}
	

	}


