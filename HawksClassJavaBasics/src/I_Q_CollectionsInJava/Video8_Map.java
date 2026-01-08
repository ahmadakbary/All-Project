package I_Q_CollectionsInJava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Video8_Map {
public static void main(String[] args) {

Map<Integer, ArrayList<String>> data = new  HashMap<Integer, ArrayList<String>>();
		
		data.put(1, new ArrayList<String>());
		data.put(2, new ArrayList<String>());
		data.put(3, new ArrayList<String>());
			
		data.get(1).add("Ahmad");
		data.get(1).add("Omar");
		data.get(1).add("jalal");
		
		data.get(2).add("shir");
		data.get(2).add("jan");
		data.get(2).add("sal");
		
		data.get(3).add("sharif");
		data.get(3).add("nawid");
		data.get(3).add("masoud");
		
		System.out.println(data);
		for(Integer hp: data.keySet()) {
			System.out.println(hp+ " "+ data.get(hp));
		}
		System.out.println();

	}

}
