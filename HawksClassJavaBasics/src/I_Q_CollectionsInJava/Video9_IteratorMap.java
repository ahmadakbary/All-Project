package I_Q_CollectionsInJava;
import java.util.HashMap;
import java.util.Iterator;
public class Video9_IteratorMap {
public static void main(String[] args) {
		
	System.out.println("Using Iterator with Map----------------");
	
		HashMap<String, String>	hdata = new HashMap();
		hdata.put("a", "Test1");
		hdata.put("b", "Test2");
		hdata.put("c", "Test3");
		hdata.put("d", "Test4");
		
		for (String K: hdata.keySet()) {
			System.out.println("Key: " +K+ "  value:  " +hdata.get(K));

	}
		Iterator<String> itdata = hdata.keySet().iterator();
		
		while (itdata.hasNext()) {
			String s = itdata.next();
			System.out.println(s+ "  "+hdata.get(s));
		}
}
}