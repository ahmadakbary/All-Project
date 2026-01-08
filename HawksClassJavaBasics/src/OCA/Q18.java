package OCA;

public class Q18 {

	
	public static void main(String[] args) {
		
		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		
//		for (String [] c: shirts) {
//			for (String s: c) {
//				System.out.println(s +":");
//			}
//		}
		
		for (int index = 0; index <2;) {
		    for (int idx = 0; idx <2;) {
		        System.out.println(shirts[index][idx] + " ");
		        idx++;
		    }
		    index++;
		} 
	}
	
}

