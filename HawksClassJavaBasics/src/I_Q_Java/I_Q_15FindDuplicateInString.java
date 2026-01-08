package I_Q_Java;
import java.util.HashSet;
public class I_Q_15FindDuplicateInString {
public static void main(String[] args) {
		
	
		//HashSet<String> data = new HashSet<String>();
		
		String [] values = {"Ahmad", "JJ", "Ahmad", "Omar"};
		
	for (int i = 0; i<values.length; i++) {
	for (int j = i+1; j<values.length; j++) {
		System.out.println(values[i] + " " +values[j]);
	if (values[i].equals(values[j])) {
		
		System.out.println("Duplicate values found..."+values[i]+ " " +values[j]);
			break;
			
			
				}
			}
		}
		
	}

}
