package aug_05_2021;
public class PrintFromAToZ {
public static void main(String[] args) {
	
	

	char a ='a';

	while (a<='z') {
		System.out.print(a);
		
		if (a !='z') {
			System.out.print("-");
		}
		a++;
	}
	}

}
