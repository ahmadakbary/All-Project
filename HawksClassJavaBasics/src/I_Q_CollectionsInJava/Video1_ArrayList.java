package I_Q_CollectionsInJava;
import java.util.ArrayList;
public class Video1_ArrayList {
public static void main(String[] args) {
	
ArrayList<String> data = new ArrayList<String> ();
	
	data.add("value1");
	data.add("value2");
	data.add("value3");
	data.add("value4");
	data.add("value5");
	data.add("value6");
		
	System.out.println(data);
	System.out.println(data.contains("value3"));
		
	//forloop
	for (int i = 0; i<data.size(); i++) {
		System.out.println(data.get(i));
	
	//foreach loop	
	for(String j: data) {
	System.out.println(j);
			}
		}
		
}
}
