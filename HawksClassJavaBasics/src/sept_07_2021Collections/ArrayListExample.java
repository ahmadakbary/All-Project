package sept_07_2021Collections;
import java.util.ArrayList;
public class ArrayListExample {
public static void main(String[] args) {
		
ArrayList<Integer> data = new ArrayList<Integer>();
		
			data.add(53);
			data.add(29);
			data.add(23);
			data.add(23);
			data.add(98);	
			data.add(87);	
			data.add(65);	
System.out.println(data.contains(53)); // this confirm the exact values we have or not
System.out.println(data.indexOf(53)); // this get us the index number of 53
	for (int i = 0; i <data.size(); i++) {
		System.out.println(data.get(i));
		
		}
		
}

}
