package aug_03_2021_Lab_01;
public class LabSessions {
public static void main(String[] args) {
		
	System.out.println("----Additions----");
		AdditionOfTwoDigiti(40, 60);
		AdditionOfTwoDigiti(60, 40);
		AdditionOfTwoDigiti(20, 80);
		
		System.out.println("----Multiplications----");	
		multiplications(10, 4);
		multiplications(5, 3);
		
		System.out.println("----Subtractions----");	
		SubtractionOfTwoDigiti(34, 10);
		SubtractionOfTwoDigiti(15, 4);
		
		System.out.println("----Divissions----");
		DivissionOfTwoDigit(12, 2);
		DivissionOfTwoDigit(123, 5);		
}
public static void AdditionOfTwoDigiti(int nbr1, int nbr2) {	
		int Additiontotal = nbr1 + nbr2;
		System.out.println("sum is:--"+Additiontotal);		
}
public static void multiplications(int nbr1, int nbr2) {
		int multiTotal =  nbr1 * nbr2;
		System.out.println("sum is--"+multiTotal);		
}
public static void SubtractionOfTwoDigiti(int nbr1, int nbr2) {	
		int Subtractointotal = nbr1 - nbr2;
		System.out.println("sum is:--"+Subtractointotal);			
}
public static void DivissionOfTwoDigit(int nbr1, int nbr2) {
		int DivissionTotal =  nbr1 / nbr2;
		System.out.println("sum is--"+DivissionTotal);
				
		

	}

}
