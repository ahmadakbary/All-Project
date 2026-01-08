package OCA;

import java.util.ArrayList;
import java.util.List;

public class Q196 {
	
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Tech");
		arrayList.add("Expert");
		arrayList.set(0, "Java");
		arrayList.forEach(a -> a.concat("Forum"));
		arrayList.replaceAll(a -> a.concat("Forum"));
		System.out.println(arrayList);

	}

}
