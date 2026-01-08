package Aug_04_21;
public class LoopingExamples {
public static void main(String[] args) {
		
	String text = "radar";
	int i = 4;
	
	System.out.println(text.charAt(i));
	System.out.println(text.length());
	
	
	while (i<text.length()) {
		System.out.println(i++);
	}
			
	}

}
