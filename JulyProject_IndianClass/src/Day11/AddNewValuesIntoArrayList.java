package Day11;
import java.util.ArrayList;
public class AddNewValuesIntoArrayList {
public static void main(String[] args) {
		
	ArrayList list=new ArrayList();
		list.add(100);
		list.add("welcome");
		list.add(15.5);
		list.add('A');
		list.add(true);
	
	System.out.println(list.size());
	System.out.println(list);
	list.remove(2);
System.out.println("After removing "+list);
list.add("Java");
System.out.println("After adding "+list);
	

	}

}
