package I_Q_Java;
public class I_Q_12ReverseString1WhileLoop {
public static void main(String[] args) {
	
	String text = "Testing";
	int i = text.length()-1;
	
	while (i>=0) {
		System.out.print(text.charAt(i--));
	}
	
	
	String s="SELENIUM";
	int  len=s.length();
		String rev="";
		for (int j=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
			System.out.println(rev);
	}



}


/*

 	String s="SELENIUM";
	int  len=s.length();
		String rev="";
	for (int i=len-1;i>=0;i--){
	rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	}

}

 
*/