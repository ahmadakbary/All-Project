package I_Q_CollectionsInJava;
import java.util.ArrayList;
public class Video8_CollectionOfCollectioneeees {
public static void main(String[] args) {
	
	ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
	data.add(new ArrayList<String>());//0
	data.add(new ArrayList<String>());//1
	data.add(new ArrayList<String>());//2
	data.add(new ArrayList<String>());//3
	data.add(new ArrayList<String>());//4
	
	//index 0
	data.get(0).add("1");
	data.get(0).add("2");
	data.get(0).add("3");
	
	//index 1
	data.get(1).add("Apple");
	data.get(1).add("iPhone");
	
	//index 2
	data.get(2).add("loing");
	data.get(2).add("Tigger");
	
	//index 3
	data.get(3).add("Ahmad");
	data.get(3).add("Jalal");
	data.get(3).add("Jamal");
	System.out.println(data);
		
	for (int i = 0; i<data.size(); i++) {
		System.out.println(data.get(i));
			for (int j = 0; j<data.get(i).size(); j++) {
				System.out.println(data.get(i).get(j));	
	}
	System.out.println();
	}
		System.out.println("Foreach Loop---------------------");
		for (ArrayList <String> i : data) {
			for (String v : i) {
				System.out.println(v+ " ");
			}
			System.out.println();
		}
}
}
