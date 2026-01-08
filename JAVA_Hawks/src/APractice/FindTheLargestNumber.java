package APractice;

public class FindTheLargestNumber {
	
	public static void main(String[] args) {
		
		
		int [] data = {23,23,0,3,4,5,6,7,6,4,3,234,53452};
		
			int largest = data [0];
			int smallest = data[0];
			
			for (int i = 0; i<data.length; i++) {
				if (data[i]>largest)
					largest=data[i];
				System.out.println(largest);
			}
			
			
			for (int i = 0; i<data.length; i++) {
				if (data[i]<smallest) {
					smallest=data[i];
					System.out.println(smallest);
				}
			}
	}

}
