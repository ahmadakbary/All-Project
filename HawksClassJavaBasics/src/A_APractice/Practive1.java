package A_APractice;

public class Practive1 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Ahmad welcome back to QA Environment");
		System.out.println("the sum is --> "  +10+5);
		System.out.println("the sum is --> "  +(10-5));
		System.out.println("the sum is --> "  +(10*5));
		System.out.println("the sum is --> "  +(10/5));
	System.out.println("*******************************************");	
		
		int age = 19;
		System.out.println("Check voting age here");
		if (age>=18) {
			System.out.println("Person can vote");
		}else {
			System.out.println("Person can not vote");
		}
			
		System.out.println("Vote Exited");
		
		
		//Check odd and even number
		
		int number = 20;
		
		if (number%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number odd");
		}
		
		
		
		
		int a = 5;
		
		if (a%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("numner is odd");
		}
		
		
		int b =0;
		
		if(b==1) {
			System.out.println("sunday");
		}else if(b==2) {
			System.out.println("Mondya");
		}else if(b==3) {
			System.out.println("Thuesday");
		}else if (b==4) {
			System.out.println("Wednesday");
		}else if (b==5) {
			System.out.println("Thuresday");
		}else if(b==6) {
			System.out.println("Friday");
		}else if (b==7) {
			System.out.println("Saterday");
		}else{
			System.out.println("Friday"); 
			
		}
		
		
		
		
		double grade = 75.99;
		
		if (grade>=90 && grade <=100) {
			System.out.println("grade is A");
			
		}else if(grade>=80 && grade<=90) {
			System.out.println("Grade is B");
		
		}else if (grade>=70 && grade<=80) {
			System.out.println("Grade is B");
		}else if (grade>=60 && grade<=70) {
			System.out.println("Grade is C");
		}else {
			System.out.println("input correct number ");
			}
		
		
	}
}
