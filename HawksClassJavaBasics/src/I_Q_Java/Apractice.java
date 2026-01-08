package I_Q_Java;
public class Apractice {
public static void main(String[] args) {
	
	
	String reverse = "I love automation";
	System.out.println(RevString(reverse));
	
}
	public static  String RevString(String str) {
		String [] text = str.split(" ");
		String revers = "";
		
		for (int i = text.length-1; i>=0; i--) {
			revers += text[i]+ " ";
		}
		
		return revers;
				
	}
	
	
	
  }
