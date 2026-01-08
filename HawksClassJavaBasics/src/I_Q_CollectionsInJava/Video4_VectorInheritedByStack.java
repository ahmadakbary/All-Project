package I_Q_CollectionsInJava;
import java.util.Stack;
public class Video4_VectorInheritedByStack {
public static void main(String[] args) {
	
	Stack<String> data = new Stack<String>();
	data.add("Ahmad");
	data.add("jj");
	data.add("jalal");
	data.add("Omar I am last one");
	
	System.out.println(data);
	System.out.println(data.firstElement());
	System.out.println(data.peek());
	System.out.println(data.pop());
	System.out.println(data);
}
}
