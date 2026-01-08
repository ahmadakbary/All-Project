package I_Q_CollectionsInJava;
import java.util.LinkedList;
public class Video2_LinkedList {
public static void main(String[] args) {

	LinkedList<String> data = new LinkedList<String>();
		data.add("ahmad");
		data.add("jalal");
		data.add("Jamal");
		data.add("Omar");
		data.add("Leah");
	
	System.out.println(data);
	System.out.println(data.contains("ahmad"));
	
	for (int i = 0; i<data.size(); i++) {
		System.out.println(data.get(i));
		
		for(String j: data) {
			System.out.println(j);
}
		System.out.println();
	}
	
	

	}

}
