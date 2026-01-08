package javaPractice;

public class Practice8SwitchWithIfConditions {
	public static void main(String[] args) {
		
		String Store = "macys";
		
		System.out.println("lif from if Statement");
		if (Store.equals("Costco")) {
			System.out.println("oil");
			System.out.println("eggs");
			
		}else if (Store.equals("wallmart")) {
			System.out.println("water");
			System.out.println("salt");
			
		}else if (Store.equals("macys")) {
			System.out.println("channel");
			System.out.println("body spray");
	
	
		}else if (Store.equals("target")) {
			System.out.println("shoe");
			System.out.println("toys");


		}else if (Store.equals("wholeFood")) {
			System.out.println("milk");
			System.out.println("apple");
}		else {
		System.out.println("plz pick the correct store to shop");
}
		System.out.println();
		
		System.out.println("***** Conditions with Switch Statements");		
		switch (Store) {
		case "Costco":
			System.out.println("channel");
			System.out.println("body spray");
			break;
			
		case "target":
			System.out.println("channel");
			System.out.println("body spray");
			break;
			
		case "macys":
			System.out.println("channel");
			System.out.println("body spray, shoes jacket");
			break;
			
		case "walmart":
			System.out.println("milk and oil salt");
			System.out.println("ice creat");
			break;
		default:
			System.out.println("choose the correct store");
			
		}

	}
}
