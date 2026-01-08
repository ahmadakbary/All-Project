package A_APractice;

import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		
		System.out.println("Program starts here");
		System.out.println("ENTER NUMBER");
	Scanner sc=new Scanner (System.in);
	int a=sc.nextInt();
	
	try{
		System.out.println(100/a);
	}catch(ArithmeticException e) {
		System.out.println("Invalid Number");
		System.out.println("100 cant be divided  "+e.getMessage());
	}	
	
	String s="123";
	
	int c=Integer.parseInt(s);
	System.out.println(c);
	
	
	
	
	
	
	}
}
