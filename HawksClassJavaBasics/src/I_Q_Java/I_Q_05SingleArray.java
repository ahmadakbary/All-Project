package I_Q_Java;
public class I_Q_05SingleArray {
public static void main(String[] args) {
				
	//int [] data =  new int[5]; // one way to declare
	//int [] data = {50,60,40,20,10};
	String [] arr = new String [5];
		
		arr[0] = "50";
		arr[1] = "60";
		arr[2] = "40";
		arr[3] = "20";
		arr[4] = "10";
		//System.out.println(arr[3]);
		
		System.out.println("forLoop for length: ---------------------");
		for (int i = 0; i<arr.length; i++) {
			System.out.println("length: " +i);
		}
		System.out.println();
		System.out.println("foreach loop for values: ----------------");
		for (String j: arr) {
			System.out.println("values: " +j);
		}
	}
}
