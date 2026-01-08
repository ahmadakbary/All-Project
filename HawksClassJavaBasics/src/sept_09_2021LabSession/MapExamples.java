package sept_09_2021LabSession;
import java.util.HashMap;
public class MapExamples {
public static void main(String[] args) {
	
	//this is HashMap of String of String
	HashMap<String, String> temp = new HashMap<String, String>();
	
	temp.put("firstName", "Jack");
	temp.put("lastName", "Daniel");
	temp.put("Age", "21");
	temp.put("Address", "6201 lessburg, Falls Church");
	
	
	System.out.println(temp.get("Address"));
	System.out.println(temp.get("Age"));
	
	System.out.print(temp);
	
	System.out.println(temp.values());
	System.out.println(temp.keySet());
	
		}
		
	}
	
	


