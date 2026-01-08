package july_28_2021;
public class SelectionExamples {
public static void main(String[] args) {
	//Store Receipt for customer		
	//double item1
	//double item2
	//double item3
	//double sum 
	
	//Items:
			//Item1......$amount
			//Item1......$amount
			//Item1......$amount
			//
			// total........$the sum
			//TaxRate (%2.5).... $tax amount
			//Shipment .....$ 10% total
			//discount......3.8%
			//Grand Total.... $ the sum after tax and shipment		
	double item1 = 10.30;
	double item2 = 14.50;
	double item3 = 12.10;
	double sum = item1 + item2+ item3;		
	
	double taxRate =2.5 / 100;	
	double taxAmount = sum * taxRate;
	double shipment = sum * 10 /100;
	double discount = sum * 3.8;
	double grandTotal = sum + taxAmount+ shipment- discount;
System.out.println("*** Store Receipt ***");
System.out.println();
System.out.println("items:");
System.out.println("Item1 . . . $" + item1);
System.out.println("Item1 . . . $" + item2);
System.out.println("Item1 . . . $" + item3);
System.out.println();
System.out.println("Total\t\t . . . $" + sum); //\t\t organize ur text in console
System.out.println("Tax (2.5%)\t . . . $" + taxAmount);// \t this organize ur text too.
System.out.println("Shipment\t . . . $" + shipment); // \t it does the tab job 
System.out.println("Discount\t . . . $" + discount);
System.out.println("******************************************************");
System.out.println("GrandTotal\t . . . $" + grandTotal);
	
		
	
		
		
		
		
		
	}

}
