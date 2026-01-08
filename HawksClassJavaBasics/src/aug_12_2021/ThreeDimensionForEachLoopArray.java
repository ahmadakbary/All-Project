package aug_12_2021;
public class ThreeDimensionForEachLoopArray {
public static void main(String[] args) {
		

	
	int [][][] data = new int [2][15][3];
	int number = 1;

//for each loop
	for (int[][] table : data) {//this goes through 3rd Dim and returns 2Dim on each iterations
		for (int[] row : table) {//this goes through 2Dim and returns 1Dim on each iterations
			for (int cell : row) {//tis goes through 1Dim and returns int on each iteration
				cell = number++; // we assign the number to that index and then increase it by 1
			}
		}
		
	}
	
	
	}

}
