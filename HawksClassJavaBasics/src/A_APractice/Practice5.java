package A_APractice;
import java.rmi.AccessException;
import java.util.Scanner;
public class Practice5 {	
	public static void main(String[] args) {
		
	
		
		Scanner s=new Scanner(System.in);
		System.out.println("Program Started...");
		System.out.println("ENTER NUMBER");
		
		int a=s.nextInt();
		
		try{
			System.out.println(100/a);
		}catch(ArithmeticException e) {
			System.out.println("Invalid Number");
			System.out.println("100 can't be " +e.getMessage());
		}
		
}
}