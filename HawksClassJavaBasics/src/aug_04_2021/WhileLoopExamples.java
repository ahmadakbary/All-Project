package aug_04_2021;
public class WhileLoopExamples {
public static void main(String[] args) {
		
System.out.println("--Question(1)-- 1,2,3,4,5,6,7,8,9,10");	
	int a = 1;
	while (a<=10) {
	System.out.println(a++);
	}	
System.out.println("--Question(2)--1,3,5,7,9 ");	
	int b = 1;
	while (b<=10) {
	System.out.println(b);
	b +=2;
	}	
System.out.println("--Question(3)--1,2,3,4,5 ");	
	int d = 1;
	while (d<=5) {
	System.out.print(d++ + "\t");	
	}
	System.out.println();
System.out.println("--Question(4)--5,4,3,2,1 ");	
	int e = 5;
	while (e>=1) {
	System.out.print(e-- + "\t");
}
}
}