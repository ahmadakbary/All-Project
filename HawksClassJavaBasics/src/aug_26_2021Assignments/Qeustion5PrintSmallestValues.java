package aug_26_2021Assignments;
public class Qeustion5PrintSmallestValues{ 
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

	System.out.println(" *******************************************");			
		char []	chars = {'c', 's', 'c', 's', 'r', 'g', 'a', 'a', 'd', 'g'};		
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == chars[i - 1]) {
				System.out.println("found it" +chars[i]+ "'char is duplicate in sequnce on index " +i+ " and " +(i-1));
				System.out.println(chars[i]);
				break;
			}
			
		}
				
		
		
		}

	}
