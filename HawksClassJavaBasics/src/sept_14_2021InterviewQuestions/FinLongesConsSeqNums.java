package sept_14_2021InterviewQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
public class FinLongesConsSeqNums {
public static void main(String[] args) {
		int [] samples = {1, 2, 3, 5, 6, 1, 2, 3, 3, 2, 1, 4, 3, 2, 1, 1000, 2000, 47};
			// 1,2,3,4,5,6,1000,2000	
	
		FindLongesConscSeqNums(samples);		
	}
	public static void FindLongesConscSeqNums(int[]numbers) {
		TreeSet<Integer> tempNumbers =  new TreeSet<Integer>();
	//a list of a collection that stores the numbers
		for (int i = 0; i<numbers.length; i++) {
			tempNumbers.add(numbers[i]);
		}
		System.out.println(tempNumbers);
		
	// a list of a collection that stores the numbers
		List<Stack<Integer>> sequences = new ArrayList<Stack<Integer>>();
		
		int counter = 0;
		for(Integer num: tempNumbers) {//going through the set
			if (sequences.size() == 0) {//its the first number
				sequences.add(new Stack<Integer>());//initialize the stack in the list
				sequences.get(counter).add(num);//add the number to the stack in that index of the list 
				continue;//go to the next iteration
			}
				if (sequences.get(counter).peek() + 1 ==num) {//the num is the sequence
					sequences.get(counter).add(num);// this add number to the stack in that index
				}else {//if the number is not in sequence
						counter++;//increase my counter
						sequences.add(new Stack<Integer>());//initialize the stack in this new index of the list
						sequences.get(counter).add(num);//add then number to this new stack that was initialized
					}
				}
		System.out.println(sequences);
		}
	}


