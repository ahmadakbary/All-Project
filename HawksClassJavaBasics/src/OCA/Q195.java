package OCA;

public class Q195 {
public static void main(String[] args) {
	
	int sum = 0;
	
	for (int xVal = 1; xVal<=5; xVal++) {
		sum = sum + xVal++;
		System.out.println("The sum of "+ xVal+ " numbers is " +sum);
		
	}
	//System.out.println("The sum of"+ xVal+ "numbers is" +sum); // sysout is out of the loop that's why it gives compile time error
	
}
}
