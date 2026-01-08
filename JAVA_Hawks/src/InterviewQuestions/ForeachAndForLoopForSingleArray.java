package InterviewQuestions;

public class ForeachAndForLoopForSingleArray{
	
	public static void main(String[] args) {
		
		
		String [] data = new String [10];
			data[0] ="Ahmad";
			data[1] ="Omar";
			data[2] ="Jalal";
			data[3] ="Jamal";
			data[4] ="Asma";
			data[5] ="Hadeese";
			data[6] ="Leah";
			data[7] ="Osman";
			data[8] ="Ibrahim";
			data[9] ="Timor";
		
			
			//System.out.println(data[4]);
			
		System.out.println("foreach Loop:-------------------");
		
		for (String s: data) {
			System.out.println(s);
			System.out.println();
			
			System.out.println("forloop:---------------------");
			for (int i = 0; i<data.length; i++) {
			
				System.out.println(data[i]+ " ");
			}
		}
		
	}

}
