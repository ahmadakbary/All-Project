package aug_12_2021;
public class ForEachLoopExamples {
public static void main(String[] args) {

String [] ahmad=new String [5];
	
	ahmad[0] = "testing";
	ahmad[1] = "if";
	ahmad[2] = "I";
	ahmad[3] = "understand";
	ahmad[4] = "this";
	
// for each loop
	for (String jj: ahmad) {
		System.out.print(jj+ " ");
	}
	System.out.println();
//for loop
	for (int i=0; i<ahmad.length; i++) {
		System.out.print(ahmad[i]+" ");
	}
	System.out.println();
	}


}