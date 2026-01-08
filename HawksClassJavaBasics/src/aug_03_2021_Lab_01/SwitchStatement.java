package aug_03_2021_Lab_01;
public class SwitchStatement {
public static void main(String[] args) {
		
	String drink1 = "Coke";
	String drink2 = "Redbull";
	String drink3 = "Water";
	String drink4 = "Pepsi";
		
	double price1 = 2;
	double price2 = 3;
	double price3 = 1;
	double price4 = 2;
		
	String itemSelected = "Pepsi";
		
	switch (itemSelected) {
	case "Coke":
System.out.println("Item Selected: "+drink1+"\n"+"Price: "+price1);
	break;
			
	case "Redbull":
System.out.println("Item Selected: "+drink2+"\n"+"Price: "+price2);
	break;
			
	case "Water":
System.out.println("Item Selected: "+drink3+"\n"+"Price: "+price3);
	break;
			
	case "Pepsi":
System.out.println("Item Selected: "+drink4+"\n"+"Price: "+price4);
	break;
		}

	}

}
