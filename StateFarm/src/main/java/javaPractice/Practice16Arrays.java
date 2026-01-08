package javaPractice;

public class Practice16Arrays {

	public static void main(String[] args) {

		String[] data = new String[7];

		data[4] = "Ahmad";
		data[3] = "akbary";
		data[2] = "asma";
		data[5] = "jj";

		System.out.println(data[4]);

		for (String a : data) {
			System.out.println(a);
		}
		System.out.println("   For loop    ");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
	
				
			}
	}

}
