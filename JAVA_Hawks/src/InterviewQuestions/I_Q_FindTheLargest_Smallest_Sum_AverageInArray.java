package InterviewQuestions;
public class I_Q_FindTheLargest_Smallest_Sum_AverageInArray {
public static void main(String[] args) {
	
	int [] data = {23,345,23,4,323,54,23,53,231,125};
	
		int largest = data[0];
		int smallest = data[0];
		int sum = 0;
		int average = 0;
		
		for (int i = 0; i<data.length; i++) {
			
			if (data[i]>largest) {
				largest = data[i];	
			}else if (data[i]<smallest) {
					smallest = data[i];
					
				}
			sum +=data[i];
	System.out.println();
	System.out.println("Largest Values: "+ largest);
	System.out.println("Smallest Values: " +smallest);
	System.out.println("Sum Values: "+sum);
	System.out.println("count of the values in Array: "+data.length);
	System.out.println("Average Value: "+(double)sum/data.length);
			}
			
		}
	}


