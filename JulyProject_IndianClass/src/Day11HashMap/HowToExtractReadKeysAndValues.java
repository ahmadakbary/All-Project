package Day11HashMap;
import java.util.HashMap;
public class HowToExtractReadKeysAndValues {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(101, "John");
	hm.put(102, "David");
	hm.put(103, "Smith");
	hm.put(104, "Mary");

for (Object i:hm.keySet()) {
	}
for (Object i:hm.keySet()) {
	System.out.println(i+"   "+hm.get(i));
	}
}
}
