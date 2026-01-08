package july_29_2021;
public class SwitchExamples {
public static void main(String[] args) {		
		//Target
		//costco
		//Whole food
		//Best buy	
	String storeToShop = "Best buy";
	System.out.println("list from if Statement");
	
	if (storeToShop.equalsIgnoreCase("Targe")) {
		System.out.println("carpet");
		System.out.println("toys");
		
} else if (storeToShop.equalsIgnoreCase("Costco")) {
		System.out.println("Milk");
		System.out.println("Monster");
		
} else if (storeToShop.equalsIgnoreCase("Whole food")) {	
		System.out.println("Bannana");
		System.out.println("cucumber");
		
} else if (storeToShop.equalsIgnoreCase("Best buy")) {
		System.out.println("laptop");
		System.out.println("Tv");
}else {
		System.out.println("please use the assigned store name");
	}
	System.out.println("list from switch Statement");
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
