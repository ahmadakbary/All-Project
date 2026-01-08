package BaseJava;
public class SingleArrayWithString {
public static void main(String[] args) {
	
	
	String [] data = new String [10];
		data[0] = "Ahmad";
		data[1] = "JJ";
		data[2] = "Omar";
		data[3] = "Jalal";
		data[4] = "Leah";
		data[5] = "Hadeese";
		data[6] = "Asma";
			
	System.out.println(data [4]);
	for (int i = 0; i<data.length; i++) {
		System.out.println(i);
	
	}
		
	for (String i: data) {
		System.out.println(i);
		}
}
}
