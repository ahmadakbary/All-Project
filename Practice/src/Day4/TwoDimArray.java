package Day4;
public class TwoDimArray {
public static void main(String[] args) {
		
	//	int [] [] data = new int[5][5];
		int [][] data = {{100,200},{300,400},{500,600}};
		
//		data[0][0] = 100;
//		data[0][1] = 200;
//		
//		data[1][0] = 300;
//		data[1][1] = 400;
//		
//		data[2][0] = 500;
//		data[2][1] = 600;
//		
//		data[5][0] = 500;
//		data[4][1] = 600;
//	
//		data[2][0] = 500;
//		data[3][1] = 600;
//		
		
	//	System.out.println(data[2][1]);
	//	System.out.println(data.length);
		
		for (int row = 0; row<data.length; row++) {
			for (int col = 0; col<data[row].length; col++) {
				System.out.println(data[row][col]);			
			}
			System.out.println();
		}
	}
}
