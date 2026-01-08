package I_Q_Javabasics;
public class Switch {
public static void main(String[] args) {

	String storeToShop ="Whole food";
	switch (storeToShop) {
	case "Target":
		System.out.println("carpet");
		System.out.println("toys");
		break;	
	case "Costco":
		System.out.println("Milk");
		System.out.println("Monster");
		break;		
	case "Whole food":
		System.out.println("Bannana");
		System.out.println("cucumber");
		break;	
	case "Best buy":
		System.out.println("laptop");
		System.out.println("Tv");
		default:
			System.out.println("Wrong Store");
		

	}

}
}