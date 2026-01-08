package A_APractice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String a="AFC";
		
		String b=sc.next();
		System.out.println(b);
		
		try{
			System.out.println(Integer.parseInt(b));
		}catch(NumberFormatException e) {
			
		}
	}
}
