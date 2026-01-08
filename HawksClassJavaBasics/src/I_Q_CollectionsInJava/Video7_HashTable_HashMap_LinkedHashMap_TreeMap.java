package I_Q_CollectionsInJava;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Video7_HashTable_HashMap_LinkedHashMap_TreeMap {
public static void main(String[] args) {
	
Hashtable<Integer,String> data = new Hashtable<Integer, String>();
		data.put(1, "value 1");
		data.put(2, "value 2");
		data.put(3, "value 3");
		data.put(4, "value 4");
		data.put(5, "value 5");
			System.out.println(data.contains("value 3"));
			for (int i = 0; i<data.size(); i++) {
			System.out.println(i);
		}
HashMap<String, String> hmdata = new HashMap<String, String>();
		hmdata.put("K1", "V1");
		hmdata.put("K2", "V2");
		hmdata.put("K3", "V3");
		hmdata.put("K5", "V4");
		hmdata.put("K1", "V5");
		hmdata.put(null, null);
	        System.out.println(hmdata);
	
LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("1", "V1");
		lhm.put("2", "V2");
		lhm.put("5", "V5");
		lhm.put("3", "V3");
		lhm.put("4", "V4");
		    System.out.println(lhm);
			
TreeMap<String, String> tdata = new TreeMap<String, String>();
		tdata.put("4", "V4");
		tdata.put("1", "V1");
		tdata.put("2", "V2");
		tdata.put("5", "V5");
		tdata.put("3", "V3");
		tdata.put("4", "V4");
		    System.out.println(tdata);
	

	}

}





