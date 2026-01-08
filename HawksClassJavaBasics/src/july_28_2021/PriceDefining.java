package july_28_2021;
public class PriceDefining {
public static void main(String[] args) {
	
	double item1 = 100.99;
	double item2 = 50.99;
	double item3 = 209.87;
	double sum = item1 + item2 + item3;
	
	double taxRate = 2.5 / 100;
	double taxAmount = sum * taxRate;
	double shipment  = sum * 10 / 100;
	double discount  = sum * 3.8 / 100;
	
	if (sum>500) {
		shipment = 0;
	} else if (sum > 300)	{
		shipment = sum * 5/100;
	} else if (sum >100) {
		
	}
	double grandTotal = sum + taxAmount + shipment - discount;
		System.out.println("**********Store Receipt***********");
		System.out.println();
		System.out.println("Items: ");
		System.out.println("Item1 . . . $"+item1);
		System.out.println("Item2 . . . $"+item2);
		System.out.println("Item3 . . . $"+item3);
		System.out.println();
		System.out.println("Total\t\t . . . $"+ sum);
		System.out.println("Tax(2.5%)\t . . . $"+ taxAmount);
		System.out.println("Shipment\t . . . $"+shipment);
		System.out.println("Discount\t . . . $"+ discount);
		System.out.println("GrandTotal\t . . . $"+grandTotal);
			
}
}
