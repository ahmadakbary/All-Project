package aug_09_2021;
public class ArrayExample {
public static void main(String[] args) {
		
	int [] data = new int [8];// one way to declare array
	int [] data2 = {5,1,4,8,};// second ways to declare
	
	data[0] = 5;
	data[1] = 1;
	data[2] = 4;
	data[3] = 8;
		
	//System.out.println(data.length);
	for (int i = 0; i< data.length; i++) {
			System.out.println(data[i]);
	}	
			int [] [] a = new  int [3][3];
			
			a[0][0] = 1;
			a[0][1] = 2;
			a[0][2] = 3;
			
			a[1][0] = 4;
			a[1][1] = 5;
			a[1][2] = 6;
			
			a[2][0] = 7;
			a[2][1] = 8;
			a[2][2] = 9;
			
			String  b [] = { "SD", "AK", "CA"};
			for (int i=0; i<b.length; i++) {
				System.out.println(i);
				
			}
		}

	}

