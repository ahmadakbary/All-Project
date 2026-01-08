package A_Aug_09_2021;

public class WhileLoopExamples {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		while (x>0) {
			System.out.println(x++);
			
			if (x>50) {
				break;
			}
		}
	}

}
