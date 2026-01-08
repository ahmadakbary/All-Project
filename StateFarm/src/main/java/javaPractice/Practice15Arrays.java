package javaPractice;

public class Practice15Arrays {

	public static void main(String[] args) {
		
		String data [][] = {{"AL","AI","AT"},{"AR","CA","VA","WA"},{"TX","ST","SW"}};
		
		for (int row = 0; row < data.length; row++) {
			
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(data[row][col] + " ");
			}
			System.out.println();
			
		}
	}
}
