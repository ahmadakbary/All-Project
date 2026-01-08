package sept_07_2021Collections;
import java.util.LinkedList;
public class LinkedListExample {
public static void main(String[] args) {
		
	LinkedList<Integer> data = new LinkedList <Integer>();
		
		data.add(34);
		data.add(23);
		data.add(65);
		data.add(33);
		data.add(66);
		data.add(34);
		data.add(45);
			
	System.out.println(data);
	System.out.println(data.contains(34));
	System.out.println(data.contains(34));
	System.out.println();
		for (int i = 0; i <data.size(); i++) {
		System.out.println(i);
				
			}
}

}
