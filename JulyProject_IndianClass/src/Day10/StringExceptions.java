package Day10;
import java.util.Scanner;
public class StringExceptions {
public static void main(String[] args) {
		
System.out.println("Program is started...");
System.out.println("Program is in progress..");
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter Numer:");
String s=sc.next();
	
try {
System.out.println(Integer.parseInt(s));
	}
catch (NumberFormatException e) {
System.out.println("Provided invalid input..");	
System.out.println(e.getMessage());
	}
System.out.println("program is completed");
System.out.println("program is exited...");
		
	}
}

