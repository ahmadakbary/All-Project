package I_Q_Javabasics;
public class ForeachLoopExample {
public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
	System.out.println("*********ForLoop*********");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);		
}
	System.out.println("--------foreach Loop--------");
	for (int i : arr) {
		System.out.println(i);
		
	}

	}

}
