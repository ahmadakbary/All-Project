package A_Aug_12_2021;
public class FindTheSmallestNumberInArray {
public static void main(String[] args) {
		
		int [] data = {2,3,4,3,5,4,3,1,0};
		
		int smallest = data[0];
		
		for (int i = 0; i<data.length; i++) {
			if (data[i]<smallest) {
				smallest = data[i];
			}
		}
		System.out.println("Smallest number is--> "+smallest);
		
	}

}
