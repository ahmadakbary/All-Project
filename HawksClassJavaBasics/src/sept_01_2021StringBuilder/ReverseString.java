package sept_01_2021StringBuilder;
public class ReverseString {
public static void main(String[] args) {

	StringBuilder sb = new StringBuilder("I love you ");//003same location in heap
	sb.append("end");//003 same location in heap
	sb.reverse();
	System.out.println("Reverse text: " +sb);

	

	
	
	
	
	}

}
