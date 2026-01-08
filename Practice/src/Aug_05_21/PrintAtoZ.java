package Aug_05_21;
public class PrintAtoZ {
public static void main(String[] args) {
		
		char a = 'a';
		//System.out.println((int)a);
		
		while (a<='z') {
		System.out.print(a);
		
		if (a !='z') {
			System.out.print("-");
		}
		a++;
		
	}

}
}
