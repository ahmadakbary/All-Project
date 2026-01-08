package A_Aug_12_2021;

public class FindTheLargesNumberInArray {
public static void main(String[] args) {
	
	int [] data = {23,2,2,3,4,3,2,3,4,5,6,5,4,3,2,3,4};
	
	int largest = data[0];
	
	for (int i=0; i<data.length; i++) {
		if (data[i]>largest) {
			largest=data[i];
		}
		}
	System.out.println(largest);
}
}
