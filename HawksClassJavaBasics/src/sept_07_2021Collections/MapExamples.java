package sept_07_2021Collections;
import java.util.HashMap;
public class MapExamples {
public static void main(String[] args) {
			
HashMap<Integer, String> data = new HashMap<Integer, String> ();
	data.put(1, "this is value 1");
	data.put(2, "this is value 2");
	data.put(3, "this is value 3");
	data.put(4, "this is value 4");
	data.put(4, "this is value 4");
	
	System.out.println("Printing the Map: " +data);
	System.out.println("Printing one var from the Map: "+data.get(3));
	System.out.println("Printing all keys: "+data.keySet());
	System.out.println("Printing all values: "+data.values());
		
System.out.println("***********************************************************");
	System.out.println("Going through all of the keys of a map with foreach loop");
			for (Integer i: data.keySet()) {
				System.out.println(i);
	}
System.out.println("*************************************************************");
	System.out.println("Going through all of the values of a map with foreach loop");
			for (String i : data.values()) {
				System.out.println(i);
		}
			
System.out.println("*************************************************************");
System.out.println("********Find Duplicates & Count of Duplicates****************");
			
	String [] strs = {"James", "David", "David", "David", "George", "Christopher", "George", "Ronald", "Richard", "Richard"};
	HashMap<String, Integer> namesCounts =  new HashMap<String, Integer>();
	
	for (int i = 0; i < strs.length; i++) {
		System.out.println(strs[i]);
		if (namesCounts.containsKey(strs[i])) {
			int prevCount = namesCounts.get(strs[i]);
			namesCounts.put(strs [i], prevCount +1);
		}else {
			namesCounts.put(strs[i], 1);
			
		}
		
	}
			System.out.println(namesCounts);
		
	}

}
