package I_Q_CollectionsInJava;
import java.util.Vector;
public class Video3_Vector {
public static void main(String[] args) {

	Vector <String> data = new Vector<String>();
	
	int x=0;
		data.add("test" +x++);
		data.add("test" +x++);
		data.add("test" +x++);
			
		System.out.println(data);
		System.out.println(data.capacity());

	}

}
