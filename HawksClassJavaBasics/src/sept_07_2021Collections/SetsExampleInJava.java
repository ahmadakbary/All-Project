package sept_07_2021Collections;
import java.util.HashSet;
import aug_12_2021.ForEachLoop;
import aug_12_2021.ForLoop;
public class SetsExampleInJava {
public static void main(String[] args) {
	
	HashSet<String> data = new HashSet<String>();
	
	System.out.println(data.add("Test"));
	System.out.println(data.add("Test1"));
	System.out.println(data.add("Test2"));
	System.out.println(data.add("Test3"));
	System.out.println(data.add("Test4"));
	System.out.println(data.add("Test1"));
		System.out.println(data);	

	// how to find duplicates in Array
	String []	values = {"Jack", "David", "Jack", "Ana"};
	    out:for (int i = 0; i<values.length; i++) {
		for (int j =i+1; j<values.length; j++) {
			System.out.println(values[i] + " "+ values[j]);
			if (values[i].equals(values[j])) {
				System.out.println("Duplicate is found-- >"+values[i]+" "+values[j]);
				break out;
			}
		}	
	}	
System.out.println("-------how to find duplicate in HashSet-----------------------");
		
		HashSet<String> temp = new HashSet<String>();
		for (int i = 0; i < values.length; i++) {
			if (temp.add(values[i]) == false) {
//if the method returns false, it means that the element already exist in the set and its duplicate
			System.out.println("Duplicate found with using a set--> "+ values[i]);
			break;
			}
			System.out.println(values[i]);
			
		}
}
}
