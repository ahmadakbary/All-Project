package I_Q_Java;
import java.util.TreeSet;
public class I_Q_07TwoDimArrayPrintTable {
public static void main(String[] args) {

int [] [] data = new int [10] [10];
int number = 10;
	
	for (int i = 0; i<data.length; i++) {
		for (int j = 0; j<data[i].length; j++) {
			data[i][j] = number;
			number++;
		
		}
	}
 
	for (int i = 0; i <data.length; i++) {
		for (int j = 0; j <data[i].length; j++) {
			System.out.print(data[i][j]+ "\t");
			
		}
		System.out.println();
	}

}


}