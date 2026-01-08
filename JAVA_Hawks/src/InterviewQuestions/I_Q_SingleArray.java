package InterviewQuestions;

public class I_Q_SingleArray {

	public static void main(String[] args) {
		
	
		
		
	//int [] data =  new int[5];
	String [] arr = new String [5];
		
		arr[0] = "50";
		arr[1] = "60";
		arr[2] = "40";
		arr[3] = "20";
		arr[4] = "10";
		//System.out.println(arr[3]);
		
		System.out.println("forLoop for length: ---------------------");
		for (int i = 0; i<arr.length; i++) {
			System.out.println("length:  " +i);
		}
		System.out.println();
		System.out.println("foreach loop for values: -----------------");
		for (String j: arr) {
			System.out.println("values:  " +j);
		}
	}
}
