package Day11HashMap;
import java.util.HashMap;
public class HowToRemoveValues {
public static void main(String[] args) {
		
	HashMap hm=new HashMap();
	hm.put(101, "John");
	hm.put(102, "David");
	hm.put(103, "Smith");
	hm.put(104, "Mary");
	
	System.out.println(hm);
	System.out.println(hm.size());
System.out.println("Before removing"+hm);
	
	hm.remove(103);
System.out.println("After removing"+hm);




}
}