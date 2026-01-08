package A_July_29_2021;

public class SwitchStatments {
public static void main(String[] args) {
	
	String drink1 = "Coke";
	String drink2 = "Sprite";
	String drink3 = "RedBull";
	String drink4 = "Monster";
	
	double price1 = 6;
	double price2 = 3;
	double price3 = 4;
	double price4 = 2;
	
	String itemSelected = "Monster";
	
	switch (itemSelected) {
	case "Coke":
		System.out.println("items selected: "+drink1+"\t "+"price1$:"+price1);
		break;
	case "Sprite":
		System.out.println("items selected: "+drink2+"\t "+"price1:"+price2);
		break;
		
	case "RedBull":
		System.out.println("items selected: "+drink3+"\t "+"price1:"+price3);
		break;
	
	case "Monster":
		System.out.println("items selected: "+drink4+"\t "+"price1:"+price4);
		break;
	
	
	
	}
}
}
