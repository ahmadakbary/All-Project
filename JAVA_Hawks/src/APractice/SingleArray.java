package APractice;
public class SingleArray {
public static void main(String[] args) {
	
	String [] data = new String [10];
		
		data[0] =  "ahmad";
		data[1] =  "jj";
		data[2] =  "dd";
		data[3] =  "ss";
		data[4] =  "aa";
		data[5] =  "ee";
		data[6] =  "rr";
		data[7] =  "ee";
		data[8] =  "er";
		data[9] =  "asad";
		
		for (String i: data) {
			System.out.print(i+ " ");
		}
		System.out.println("_________________________");
		
		
		
		for (int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	
		
	}
	
	
}
