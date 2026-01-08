package JavaFullClass;

public class Assignment {

	public static void main(String[] args) {
		
		
		int computer=90;
		int linux=80;
		int science=60;
		
		int total=computer+linux+science;
		System.out.println(total);
		int average=total/3;
		int percentage=(computer+linux+science/total * 100);
		
		int grade=80;
		
		if (grade>=90 & grade<=100) {
			System.out.println(" A grade");
		
		}else if (grade>=80 & grade<=90) {
			System.out.println("B grade");
			
		}else if (grade>=70 & grade<=80) {
			System.out.println("C grade");
			
		}else if (grade>=60 & grade<=70) {
			System.out.println("D grade");
			
		}else if (grade>=50 & grade<=60) {
			System.out.println("E grade");
			
		}else if (grade>=40 & grade<=50) {
			System.out.println("F grade");
			
		}else  {
			System.out.println("sorry failed");
	}
}
}