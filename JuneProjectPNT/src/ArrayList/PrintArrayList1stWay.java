package ArrayList;
import java.util.ArrayList;
public class PrintArrayList1stWay {
public static void main(String[] args) {
		
	ArrayList ob=new ArrayList();
	System.out.println(ob);
	System.out.println(ob.size()); //size of the Array
	ob.add(1000); //Wrapping or autoboxing
	ob.add(true); //boolean value
	ob.add(6.66666);
	System.out.println(ob.get(0));
	System.out.println(ob.size()); 
	// line 13 Print size of the arraylist which line 9,10,& 11

	// First Way to Print
		for (int i=0; i<ob.size();i++) {
			System.out.println(ob.get(i));	
	
	
	}

}
}