package Aug_09_21;

public class ArraysExamples {
public static void main(String[] args) {
	
	
	 int [] data = new int [5];
	 data[0] = 10;
	 data[1] = 20;
	 data[2] = 30;
	 data[3] = 40;
	 data[4] = 50;
	 
	 //System.out.println(data[4]);
	// System.out.println(data.length);
	 
	 for (int i = 0; i<data.length; i++) {
		 System.out.println(i);
		 System.out.println(i+ data[i]+ " ");
	 }
}
}
