package A_Aug_12_2021;

public class ForLoopWithWhileLoop {
public static void main(String[] args) {
	
	String []	data = new String[5];
	
	data[0] = "Jamal";
	data[1] = "is";
	data[2] = "very";
	data[3] = "strong";
	data[4] = "boy";
	
	int num = 0;
	
	while (num<data.length) {
		System.out.print(data[num++]+" ");
	}
	
}
}
