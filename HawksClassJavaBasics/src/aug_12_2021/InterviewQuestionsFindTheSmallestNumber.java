package aug_12_2021;
public class InterviewQuestionsFindTheSmallestNumber {
public static void main(String[] args) {
		
	//go through this array and find the largest number 
int[] data = { 23, 34, 45, 0, 6, 45, 23, 1, 234, 5, 6, 34, 3423, 4 };
		
	int smallest = data[0];
		
		for (int i = 0; i < data.length; i++) {
			if (data[i]<smallest) {
				smallest = data[i];						
			}
		}
		System.out.println(smallest);
	}

}
