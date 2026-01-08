package Day11;
import java.util.HashMap;
public class HashMapExamples {
public static void main(String[] args) {
		
		
	//	HashMap <String, String> Data =  new HashMap<String, String>();
		
HashMap data = new HashMap();

	data.put(101, "Ahmad");
	data.put(202, "jj");
	data.put(303, "Omar");
	data.put(404, "Jalal");
	data.put(505, "leah");
	data.put(505, "leah");
	data.put(606, "Hadeese");
	data.put(707, "Asma");
	
	System.out.println(data);
	System.out.println(data.size());
	System.out.println(data.remove(03));

	System.out.println("****************************");
	
	
	for (int i = 0; i<data.size(); i++) {
		System.out.println(data);// print keys & values
		
		
	}
	System.out.println();
	
	for (Object i: data.keySet()) {
		System.out.println(i+"  "+data.get(i));
	}
	}

}
