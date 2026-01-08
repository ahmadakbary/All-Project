package A_July_29_2021;
public class SwitchStatment {
public static void main(String[] args) {
	
// conditional Statement
	String storetoShop = "Target";

	System.out.println("*********ConditionalStatements***********");
	if (storetoShop.equalsIgnoreCase("Target")){
		System.out.println("shirts");
		System.out.println("pants");
		System.out.println("shoes");
	}else if (storetoShop.equalsIgnoreCase("BestBuy")) {
		System.out.println("tv");
		System.out.println("iPhone");
		System.out.println("Camra");
	}else if (storetoShop.equalsIgnoreCase("Costco")) {
		System.out.println("milk");
		System.out.println("eggs");
		System.out.println("Ice cream");
	}	
// switch statements	
	System.out.println("***********Switch Statment***********");
	switch (storetoShop) {
	case  "Target":
		System.out.println("carpet");
		System.out.println("Toys");
		break;
	case "Casco":
		System.out.println("Moster");
		System.out.println("Milk");
		break;
	case "BestBuy":
		System.out.println("Laptop");
		System.out.println("TV");
		break;
	default:
		System.out.println("Wrong Store");
		
		
		
		}
}
}
