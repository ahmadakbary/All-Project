package sept_07_2021Collections;
import java.util.HashMap;
public class HashMapExamples {
public static void main(String[] args) {
	
System.out.println("********Find Duplicates & Count of Duplicates Names***********");
				
String [] strs = {"James", "Tim", "Tim", "Tim", "George", "Mike", "George", "Ronald", "Ahmad", "Ahmad"};
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
