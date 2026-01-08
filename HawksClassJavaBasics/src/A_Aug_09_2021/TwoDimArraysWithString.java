package A_Aug_09_2021;

import java.util.function.ToDoubleBiFunction;

public class TwoDimArraysWithString {
public static void main(String[] args) {
	
	
String [][] TwoDimArrays={{"SD","AK", "CA", "KL"},{"AL","MS","EC"},{"DE","OK","IL"}};
	

	for (int row = 0; row<TwoDimArrays.length; row++) {
		for (int col = 0; col<TwoDimArrays[row].length; col++) {
			System.out.print(TwoDimArrays[row][col] +"\t");
			
		}
		System.out.println();
	}
}
}
