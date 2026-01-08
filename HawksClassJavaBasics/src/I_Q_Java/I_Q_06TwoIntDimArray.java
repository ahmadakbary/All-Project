package I_Q_Java;
import java.util.TreeSet;
import aug_11_2021.ForEachLoop;
public class I_Q_06TwoIntDimArray {
public static void main(String[] args) {
	
	
	int [][] data = new int [5][5];	
	data[0] [0] = 15;
	data[0] [1] = 10;
	data[0] [2] = 20;
	
	data[1] [0] = 30;
	data[1] [1] = 45;
	
	data[2] [0] = 35;
	data[2] [2] = 100;
		
	for (int i = 0; i<data.length; i++) {
		for (int j = 0; j<data[i].length; i++) {		
		System.out.println(i);
		System.out.println(data[i][j]);
		
	}
}
}
}