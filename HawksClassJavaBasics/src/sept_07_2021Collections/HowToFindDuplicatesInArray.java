package sept_07_2021Collections;
import java.util.HashSet;
public class HowToFindDuplicatesInArray {
public static void main(String[] args) {
		
	HashSet<String> ahmad = new HashSet<String>();
	
String [] values = {"Jack", "David", "Jack", "Ana"};
			
out:for (int i = 0; i < values.length; i++) {
	for (int j = i+1; j < values.length; j++) {
	System.out.println(values[i] + " " +values[j]);
	if (values[i].equals(values[j])) {
	System.out.println("Duplicate values found--> "+ values[i]+ " "+ values[j]);
	break out;
					
				}
				
			}
	
}
}
}