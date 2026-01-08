package OCA;
import java.util.ArrayList;
public class Q103 {
	
public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<>();
    points.add(1);
    points.add(20);
    points.add(3);
    points.add(4);
    points.add(null);
   
    points.remove(2);
    points.remove(null);
    System.out.println(points);
    
    for (int i=0; i<points.size(); i++) {
    	System.out.print(i +"    ");
    }
    
    
    
    
}
}
