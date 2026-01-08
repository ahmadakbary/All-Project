package A_Aug_09_2021;

public class ArrayExamples {
public static void main(String[] args) {
	
	int []	data = new int [10];

	
	data[0] = 1;
	data[1] = 2;
	data[2] = 3;
	data[3] = 4;
	data[4] = 5;
	data[5] = 6;
	data[6] = 7;
	data[7] = 8;
	data[8] = 9;
	data[9] = 10;


	
	System.out.println(data.length);
	System.out.println(data[3]);
	for (int i = 0; i<data.length; i++) {
		System.out.print(i);
		
	}
	
}
}
