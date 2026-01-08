package A_Aug_12_2021;
public class FindLargest_Smallest_Sum_AndAverageNumberInArray {
public static void main(String[] args) {
			
	int []	data = {2,23,4,3,43,23,34,4234,0};
		
		int largest = data[0];
		int smallest = data[0];
		int sum = 0;
		int average = 0;
			
		for (int i = 0; i<data.length; i++) {
			if (data[i]>largest) {
				largest = data[i];
			}
			if (data[i]<smallest) {
				smallest = data[i];
			}
			sum += data[i];
		}
		System.out.println("Largest values is\t"+largest);
		System.out.println("Smallest values is\t"+smallest);
		System.out.println("sum values is\t\t"+sum);
		System.out.println("Count in array\t\t"+data.length);
		System.out.println("Average values is\t"+(double)sum/data.length);
		
	}
	
	
	
	
	
}
