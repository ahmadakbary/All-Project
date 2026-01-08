package APractice;
public class largestAndSmallestArray {
public static void main(String[] args) {
		
		int []	data = {23,4,3,0,32,3,3443,345,345,34,35,31,1};
		int smallest = data[0];
			
		for (int j = 0; j<data.length; j++) {
				if (data[j]<smallest) {
					smallest = data[j];		
			}
			}
			System.out.println(smallest);
		}
		
	}

