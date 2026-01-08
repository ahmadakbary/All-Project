package aug_26_2021Assignments;
public class Question2 {
public static void main(String[] args) {
	
String [] name  = new String [5];
	
	name [0] = "Book";
	name [1] = "testing";
	name [2] = "I am going to get a job";
	name [3] = "learning";
	name [4] = "My Code works";
	
Question2 obj =  new Question2 ();
	for (int i = 0; i < name.length; i++) {
		System.out.println(obj.revString(name[i]));
		
	}
}
	public String revString(String str) {
		int lengthOfWord = str.length();
		String rev = "";
		
		if (lengthOfWord % 2==0) {
		
			for (int i = lengthOfWord-2; i>=0; i--) {
				rev += str.charAt(i);
			}
			}else {
				for (int i = lengthOfWord-1; i>=0; i--) {
					rev += str.charAt(i);
					
				}
			
		}
		return "rev";
	}

}
