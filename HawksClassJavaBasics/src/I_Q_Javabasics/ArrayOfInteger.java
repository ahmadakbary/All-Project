package I_Q_Javabasics;
public class ArrayOfInteger {
public static void main(String[] args) {
	
	int []	data = new int[5];
	data[0] = 5;
	data[1] = 10;
	data[2] = 15;
	data[3] = 20;
	data[4] = 25;
	
	for (int  i= 0; i<data.length; i++) {	
	 System.out.println("forloop"+data[i]);	
	}
	for(int i: data) {
	System.out.println("foreach loop\t"+i);
	
	
	}
	

}

}
