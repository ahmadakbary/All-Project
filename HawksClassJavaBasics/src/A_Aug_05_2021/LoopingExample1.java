package A_Aug_05_2021;

public class LoopingExample1 {
public static void main(String[] args) {
	
	String text ="radar";
	int i=3;
	
	System.out.println(text.charAt(i));
	System.out.println(text.length());
	
	while (i<text.length()) {
		System.out.print(i++ +"\t");
		
	}
}

}
