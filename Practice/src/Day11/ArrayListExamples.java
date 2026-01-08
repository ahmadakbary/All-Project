package Day11;

import java.util.ArrayList;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		
		ArrayList <Object> data = new ArrayList<Object>();
		
		data.add("ahmad");
		data.add(23);
		data.add(true);
		data.add(23.3);
		data.add(4343443);
		data.add('A');
		
		System.out.println(data);
		System.out.println(data.size());
		data.remove(2);
		System.out.println(data);
		data.add(3, "Afghanistan");
		System.out.println(data);
		System.out.println(data.get(3));
		
		for (int i = 0; i<data.size(); i++) {
			System.out.println(i);
			System.out.println(data.get(i));
		}
		System.out.println("******************");
		for (Object i: data) {
		System.out.println(i);
		}
		
	}

}
