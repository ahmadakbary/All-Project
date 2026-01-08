package aug_12_2021;
public class ThreeDimensionForLoopArray {
public static void main(String[] args) {
		
	int [][][] data = new int [4][5][4];
	int number = 1;
	
for (int ThreeDim = 0; ThreeDim <data.length; ThreeDim++) {// this loop is going through the 3rd dimension and 2 tables
	for (int row = 0; row < data[ThreeDim].length; row++) {// this going through each row of the table
		for (int cell = 0; cell < data[ThreeDim][cell].length; cell++) {//this going through the cells of each row
				data[ThreeDim][row][cell]=number++; //we assign the number to that index and then increase it by 1
			}
		}
	}	
//for each loop
for (int[][] table : data) {//this goes through 3rd Dim and returns 2Dim on each iterations
	for (int[] row : table) {//this goes through 2Dim and returns 1Dim on each iterations
		for (int cell : row) {//this goes through 1Dim and returns int on each iteration				
			System.out.print(cell+ "\t");
			}
			System.out.println();// going to the next line					
	}
	System.out.println("--------------------------");
}
}
}