package sept_15_2021InterviewQuestions;
import java.util.ArrayList;
import java.util.List;
public class FibonacciNumber {
public static void main(String[] args) {
			
	System.out.println(fibNums(10000));
	}
	public static List<Integer> fibNums	(int max){
		List<Integer> nums = new ArrayList<Integer>();	
			nums.add(0);
			nums.add(1);
			
			int currentNum = 0;
			while(true) {
				//get the previous two indexes in the list of numbers
				//add them to tegether
				currentNum = nums.get(nums.size()-1)+ nums.get(nums.size()-2);
				//add the result to the arraylist
				if  (currentNum > max) {
					break; 
				}
				nums.add(currentNum);	
			}
			return nums;
}
}