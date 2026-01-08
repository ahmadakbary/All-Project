package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class PrintArrayList3rdWay {
public static void main(String[] args) {
	
	ArrayList Akbary=new ArrayList();
	System.out.println(Akbary);
	System.out.println(Akbary.size()); //size of the Array
	Akbary.add(1000); //Wrapping or autoboxing
	Akbary.add(true); //boolean value
	Akbary.add(6.66666);
	System.out.println(Akbary.get(0));
	System.out.println(Akbary.size()); 
	// line 13 Print size of the arraylist which line 9,10,& 11

// 3rd Way to Print Arraylist
		Iterator itr=Akbary.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
}
}


















