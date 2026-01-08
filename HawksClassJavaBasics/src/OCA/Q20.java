package OCA;

public class Q20 {
public static void main(String[] args) {
	
	
	int x = 5;
	while(IsAvailable(x)) {
		System.out.print(x + " ");
		x--;
		
	}
}
	 public static boolean IsAvailable(int x ) {
		 return x-- >0 ? true : false;
	}
}

