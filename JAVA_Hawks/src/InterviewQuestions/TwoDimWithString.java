package InterviewQuestions;
public class TwoDimWithString {
public static void main(String[] args) {
	

	
	String []	[] data = {{"Kabul", "Maz", "Jalalabad"},{ "Herat", "Kunduz", "Kandahar"}};
	
	for (int row = 0; row<data.length; row++ ) {
		for (int col = 0; col<data[row].length; col++) {
			System.out.print("Row" +data[row][col] );
			
			
		}
		System.out.println();
	}
	
}

}
