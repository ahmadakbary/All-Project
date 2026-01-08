package I_Q_Javabasics;
public class Multi_DimensionArray {
public static void main(String[] args) {
	// line 5 & 6 is declaring the arrays in two ways
	int [] [] numbers = new int [5] [3];
	int [] [] num = {{0,0,0},  {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}};
		numbers [0] [0] =1;
	
		int x = 1;
	
	for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers[i].length; j++) {
			numbers [i] [j] =x++;
			System.out.print(numbers [i] [j]+ " \t ");	
		}
		System.out.println();
	}

	}

}
