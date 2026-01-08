package aug_12_2021;
public class InterviewQuestionFindTheLargestNumber {
public static void main(String[] args) {
		
	//go through this array and find the largest number 
int[] data = { 54, 415, 5, 545, 10000, 5, 1, 21, 5, 1, 21, 5, 14, 1, 1, 5, 4, 5, 4, 8 };
	
	int largest =data[0];
	
	for (int i = 0; i < data.length; i++) {
		if (data[i]>largest) {
			largest=data[i];
		}	
	}
		System.out.println(largest);
	}

}
