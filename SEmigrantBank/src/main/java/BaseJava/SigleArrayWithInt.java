package BaseJava;
public class SigleArrayWithInt {
public static void main(String[] args) {
		ArrayTypes();
		
	
}
public static void ArrayTypes() {
	
	int [] data = new int [10];
		data [0] = 10;
		data [1] = 10;
		data [2] = 10;
		data [3] = 10;
		data [4] = 10;
		data [5] = 10;
		data [6] = 10;
		data [7] = 10;
	System.out.println(data[3]);
	System.out.println(data [4]);
	
	for (int i = 0; i<data.length; i++) {
		System.out.println(i);
	}
	
	for (int i: data) {
		System.out.println(i);
	}
	
	
	}
}
