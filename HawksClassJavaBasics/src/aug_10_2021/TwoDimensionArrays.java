package aug_10_2021;
public class TwoDimensionArrays {
public static void main(String[] args) {	
		
String twoDimension [][] = {{ "SD", "AK","CA","KL"},{"AL", "MS", "EC"},{"DE","OK","IL"}};
		
for (int row=0; row < twoDimension.length; row++) {
	for (int col=0; col < twoDimension[row].length; col++) {
	System.out.print(twoDimension[row][col]+ " ");
	}
	System.out.println();
			
		}
	}

}
