package I_Q_Java;
import java.util.TreeSet;
public class I_Q_16FindtheSequenceNumberInArray {
public static void main(String[] args) {
	
	
	int [] samples = {1000, 2, 4000, 5,2000, 1, 16, 3, 9, 7, 1, 4, 12, 2, 1, 1000, 2000, 47};


	FindLongesConscSeqNums(samples);		
}
	public static void FindLongesConscSeqNums(int[]numbers) {
		TreeSet<Integer> tempNumbers = new TreeSet<Integer>();// TreeSet collections does not accept duplicate
		for (int i = 0; i<numbers.length; i++) {
			tempNumbers.add(numbers[i]);
}	
			System.out.println(tempNumbers);

}
}

