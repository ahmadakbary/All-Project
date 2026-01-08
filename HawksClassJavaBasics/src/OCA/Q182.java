package OCA;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

	public class Q182 {
	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("", "#", "0", "#");
	        Iterator<String> iterator = list.iterator();
	        
	        while(iterator.hasNext()) {
	            String element = iterator.next();
	            int n = list.size();
	            
	            if (n == 5) {
	                break;
	            } else {
	                System.out.print(n);
	                ///continue;
	            }
	        }
	    }
	}
