package aug_12_2021;
public class InterviewQuestionsFindTheLargest_Smallest_Sum_AverageInTheArray {
public static void main(String[] args) {

//go through this array and find the largest, smallest, sum and the average.
int[] data = { 54, 415, 5, 454, 1, 5, 1, 21, 5, 1, 21, 5, 14, 1, 1, 5, 4, 5, 4, 8 };

		int largest = data[0];
		int smallest = data[0];
		int sum = 0;
		int average = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] > largest) {
				largest = data[i];
			} else if (data[i] < smallest) {
				smallest = data[i];
		}
			sum += data[i];
		}
		for (int i : data) {
			System.out.print(i + ", ");
		}
		    System.out.println();
			System.out.println("Largest Value: "+largest);
			System.out.println("Smallest Value: "+smallest);
			System.out.println("Sum Value: "+sum);
			System.out.println("Count of the values in array: "+data.length);
			System.out.println("Average Value: " +((double)sum/data.length));
		}

	}


