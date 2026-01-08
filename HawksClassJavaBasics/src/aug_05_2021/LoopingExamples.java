package aug_05_2021;
public class LoopingExamples {
public static void main(String[] args) {
			
	String text="abcd";
	int i=0;
		
	System.out.println(text.charAt(i));
	System.out.println(text.length());
		
	while (i<text.length()) {
	System.out.println("this is when i " +i+ text.charAt(i++));
	}

	}

}







