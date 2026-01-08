package I_Q_CollectionsInJava;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Video6_Set {
public static void main(String[] args) {		

	Set<String> data = new HashSet<String>();
		data.add("Test1");
		data.add("Test1");
		data.add("Test2");
		data.add("Test3");
		data.add("Test4");
		System.out.println(data);
		System.out.println(data.contains("3"));

	System.out.println("---------LinkedHashSet-----------");	
	LinkedHashSet<String> lkdata = new LinkedHashSet<String	>();
		lkdata.add("Test1");
		lkdata.add("Test1");
		lkdata.add("Test2");
		lkdata.add("Test3");
		System.out.println(lkdata);
	
	System.out.println("----------TreeSet----------");
	TreeSet<String> tdata = new TreeSet<String>();
		tdata.add("Test1");
		tdata.add("Test1");
		tdata.add("Test2");
		tdata.add("Test3");
		tdata.add("Test4");
		System.out.println(tdata);
	
	
	
	
	}

}
