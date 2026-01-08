package I_Q_CollectionsInJava;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Video9_IterationTechniques {
public static void main(String[] args) {
		
	ArrayList<String> data = new ArrayList<String>();
	
	data.add("1");
	data.add("11");
	data.add("111");
	data.add("1111");
	System.out.println(data);
	
	System.out.println("Using for loop----------------");
	for (int i = 0; i<data.size(); i++) {
		System.out.println(data.get(i));
	}
	System.out.println("Using foreach------------------");
	for (String j: data) {
		System.out.println(j);
	}
	System.out.println("Using iterator-----------------");
	Iterator<String> it = data.iterator();// this do the same job as forloop, foreach
	while (it.hasNext()) {
		String s = it.next();
		System.out.println(s);
		if (s.equals("111")) {
			it.remove(); //this remove the values of 111
		}
	}
	System.out.println(data);//this print after removing
	
	System.out.println("Using ListIterator------------------");
	
	ListIterator<String> listIt = data.listIterator();
	while (listIt.hasNext()) {
		String s = listIt.next();
		System.out.println(s);
				
	}
	System.out.println("Using Enumeration------------------");
	Vector<String> vec = new Vector<>();
	vec.add("a");
	vec.add("b");
	vec.add("c");
	vec.add("d");
	
	Enumeration<String> en = vec.elements();
	
	while (en.hasMoreElements()) {
	String s = en.nextElement();
	System.out.println(s);
	
	}
	System.out.println("Using Iterator with Set----------------");
	HashSet<String> hsdata = new HashSet<String>();
	hsdata.add("1");
	hsdata.add("2");
	hsdata.add("3");
	hsdata.add("4");
	
	for(String s: hsdata) {
		System.out.println(s);
	}
	
	Iterator<String> itdata = hsdata.iterator();
	while(itdata.hasNext());
	String s = itdata.next();
	System.out.println(s);
	
	
	
	
	
	
	
	
	
	
	}
	
	

}






