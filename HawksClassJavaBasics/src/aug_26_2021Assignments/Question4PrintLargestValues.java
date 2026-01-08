package aug_26_2021Assignments;
public class Question4PrintLargestValues {
public static void main(String[] args) {
	
	int [] nums  = {15,  5,   13,  5,  1,  4,  2,  5,  36,  3,  4,  2,};

		int largest = nums[0];
			for (int i = 0; i < nums.length; i++) {
				if (nums[i]> largest) {
					largest=nums[i];
			}	
			System.out.print(nums[i]+ " ");
	}
		System.out.println();
			System.out.println("The largest values is: " +largest);
			
	
	}

}
