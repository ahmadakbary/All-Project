package I_Q_CollectionsInJava;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class Video5_Queue {
public static void main(String[] args) {
		
	Queue<String> data = new PriorityQueue<String>();// first to declare
//PriorityQueue<String> Pdata = new PriorityQueue<String>();//second way to declare
	
	data.add("value1");
	data.add("value2");
	data.add("value3");
	data.add("value4");
	
	System.out.println(data);
	System.out.println(data.contains("ahmad"));
	System.out.println(data.peek());	
	System.out.println(data.poll());
	System.out.println(data);
	System.out.println("---------------------------------");
Deque<String> dqdata = new LinkedList<String>();
		dqdata.add("Ahmad");
		dqdata.add("Jalal");
		dqdata.add("Jamal");
		dqdata.add("Omar");
		dqdata.add("Leah");
		System.out.println(dqdata);// print all data
		System.out.println(dqdata.peek());// print the first values which is ahmad
		System.out.println(dqdata.contains("Jamal"));// making sure we have right value
		System.out.println(dqdata.poll());// removes the the first value which is ahmad
		System.out.println(dqdata.pollLast());//this remove first and last value from data.
		System.out.println(dqdata);// print all the data again
	}

}
