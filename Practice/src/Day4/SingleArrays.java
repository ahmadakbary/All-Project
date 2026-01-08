package Day4;
public class SingleArrays {
public static void main(String[] args) {
		
		int []	data =new int [10];
		
			data[0] = 10;
			data[1] = 30;
			data[2] = 60;
			data[3] = 50;
			data[4] = 60;
			data[5] = 56;
			data[6] = 40;
			data[7] = 80;
			data[8] = 30;
			data[9] = 30;
		//	data[10] = 30;
		//	data[8] = 30;
			//System.out.println(data);
			
			for (int i = 0; i<data.length; i++) {
				System.out.println(data[i]);
			}
			System.out.println("for Eachloop");
		 for (int i: data) {
			 System.out.println(i);
		 }
	}
}
