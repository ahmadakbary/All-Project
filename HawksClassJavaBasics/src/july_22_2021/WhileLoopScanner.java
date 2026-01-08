package july_22_2021;
import java.util.Scanner;
public class WhileLoopScanner{
public static void main(String[] args) {

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the name");
	String test = obj.nextLine();
		
while(test.equals("NA")) {
System.out.println("Can not have NA as name, please enter the name again:");
	test = obj.nextLine();
}
	System.out.println("Name: " +test);

	}

}
