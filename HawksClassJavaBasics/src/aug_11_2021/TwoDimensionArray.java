package aug_11_2021;

public class TwoDimensionArray {
	public static void main(String[] args) {

int[][] nums = new int[10][10];// Creating and array on in 10x10
int number = 1; //Creating an int starting form 1

for (int r = 0; r < nums.length; r++) {//looping through all of the rows
for (int c = 0; c < nums[r].length; c++) {// looping through all of the cells in each
		nums[r][c] = number++;//assigning the number to that cell and then increasing the number by 1
	}
}
for (int r = 0; r < nums.length; r++) {//looping through each row
for (int c = 0; c < nums[r].length; c++) {//looping through all of the cell of each row
	System.out.print(nums[r][c] + " ");//printing the value of that cell on the same line and adding space
}
System.out.println();// going to the next line after each row is done.
		}

	}

}
