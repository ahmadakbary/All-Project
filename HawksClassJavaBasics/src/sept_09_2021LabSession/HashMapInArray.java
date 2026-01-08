package sept_09_2021LabSession;
import java.util.ArrayList;
import java.util.HashMap;
public class HashMapInArray {
public static void main(String[] args) {
			
HashMap<String, ArrayList<String>> data = new HashMap <String, ArrayList<String>>();
	data.put("names",new ArrayList<String>());	
	data.put("majors",new ArrayList<String>());	
		
		System.out.println(data);
		
		data.get("names").add("Jack");
		data.get("names").add("David");
		data.get("names").add("Ana");
		data.get("names").add("Ahmad");
					
		data.get("majors").add("CS");
		data.get("majors").add("BA");
		data.get("majors").add("EN");
		data.get("majors").add("SDET");
				
	System.out.println(data);
	System.out.println("============================================");	
		
	System.out.println(data.get("names").get(0) + " " + data.get("majors").get(0));
	System.out.println(data.get("names").get(1) + " " + data.get("majors").get(1));
	System.out.println(data.get("names").get(2) + " " + data.get("majors").get(2));
	System.out.println(data.get("names").get(3) + " " + data.get("majors").get(3));

	}

}
