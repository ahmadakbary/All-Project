package InterviewQuestions;
public class I_Q_FindTheLargestValueInArray {
public static void main(String[] args) {
		
	
	int [] data = {234,34,23,23,45,234,1231,23,435};
		
		int largest = data[0];
		
		for (int i = 0; i<data.length; i++) {
			if (data[i]>largest) {
				largest=data[i];
				System.out.println(largest);
			}

			
		}
	}
}
