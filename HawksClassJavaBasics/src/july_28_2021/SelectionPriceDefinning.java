package july_28_2021;
public class SelectionPriceDefinning 	{
public static void main(String[] args) {
	
	//Store Receipt for customer			
	double item1 = 100.99;
	double item2 = 50.99;
	double item3 = 209.87;
	double sum   = item1 + item2+ item3;		
		
	double taxRate   = 2.5 / 100;	
	double taxAmount = sum * taxRate;
	double shipment  = sum * 10 /100;
	double discount  = sum * 3.8/100;
	
		if (sum > 500) {
			shipment = 0;
		}else if (sum > 300) {
			shipment = sum * 5/100;
		}else if (sum < 100) {
			shipment = sum * 15/100;
		}
	double grandTotal = sum + taxAmount + shipment - discount;		
//		Now are defining the shipment
//		If total  > 500 = shipment is free
//		If total > 300 and less than 500 = shipment is 5% of the total
//	    If total < 100 =  shipment  15 % of total	     
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



