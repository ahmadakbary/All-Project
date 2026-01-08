package aug_11_2021;
public class TwoDimensionArray_10_10 {
public static void main(String[] args) {
	
int [] [] nums=new int [10][10];
int number = 10;
	
	for (int i=0; i<nums.length; i++) {
		for (int a=0; a<nums[i].length; a++) {
			nums[i][a] = number;
			number ++;			
		}
	}
	for (int i=0; i<nums.length; i++) {
		for (int a=0;  a<nums[i].length; a++) {
			System.out.print(nums[i][a]+"\t");
		}
			System.out.println();
	}

}
}