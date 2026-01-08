package JavaFullClass;
public class Arrays {
public static void main(String[] args) {
	
	int [] studentID=new int[10];
		
		studentID[0]=600;
		studentID[1]=700;
		studentID[2]=800;
		studentID[3]=900;
		studentID[4]=400;
		studentID[5]=800;
		studentID[6]=600;
		studentID[7]=700;
					
		//System.out.println(studentID[9]);
		for (int i=0; i<studentID.length; i++) {
		System.out.println(studentID[i]);	
	}	
}
}