package july_29_2021;
public class ConditionalOperators {
public static void main(String[] args) {
	
	int num1 = 10;
	int num2 = 20;
		
String x = num1 > num2 ? "numb is more than num2":"num1 is less than num2";
	int y = num1>num2 ? num1-- : num2++;
	System.out.println(x);
			
	double grade = 60;
	String s = "The student is ";
	s+=(grade >=60)? "passed.": "failing.";
	System.out.println(s);	
//another Example
	int t = 1;
	t +=10;
	System.out.println(t);
	
	
	char a ='a';
	System.out.println((int)a);
}
}
