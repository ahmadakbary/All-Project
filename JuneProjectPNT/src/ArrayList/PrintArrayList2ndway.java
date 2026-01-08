package ArrayList;
import java.util.ArrayList;
public class PrintArrayList2ndway {
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

	// 2nd Way Iterrator to Print
		for (Object u:Akbary) {
		System.out.println(u);
			
		}
}

}