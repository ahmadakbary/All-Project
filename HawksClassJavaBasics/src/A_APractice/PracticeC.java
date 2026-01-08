package A_APractice;

public class PracticeC {
	
	public static void main(String[] args) {
		
		/*Asscending order
		for (int a=0; a<=10; a++) {
			System.out.println(a);
		}
		//Decending order
		
		for (int b=10; b>=0; b--) {
			System.out.print(" ," +b);
		}
		
	
		for (int c=2; c<=10; c=c+2) {
		System.out.print(c); */
		
		
		int [] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=15;
		
		System.out.println(a[2]);
		System.out.println(a.length);
		
		String [] b=new String[10];
		
		b[0]="Ahmad";
		b[1]="ak";
		b[2]="Aj";
		b[3]="Jamal";
		b[4]="Akbary";
		
		System.out.println(b[2]);
		System.out.println(b.length);
		
		for(String c:b) {
			System.out.println(c);
		}
		
		
		
		
		}
}