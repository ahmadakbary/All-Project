package july_28_2021;

public class CustomerReceipt {
	public static void main(String[] args) {
		
		
		double item1 = 10.30;
		double item2 = 14.50;
		double item3 = 12.10;
		double sum = item1+item2+item3;
		
		double taxRate = 2.5 / 100;
		double taxAmount = sum * taxRate;
		double shipment = sum * 10 /100;
		double discount = sum * 3.8;
		double grandTotal = sum + taxAmount + shipment - discount;
		
		System.out.println("**** Store Receipt ****");
		System.out.println();
		System.out.println("Items");
		
		System.out.println("item1 . . . $" +item1);
		System.out.println("item2 . . . $" +item2);
		System.out.println("item3 . . . $" +item3);
		System.out.println();
		System.out.println("total\t\t . . .$ " + sum);
		System.out.println("Tax (2.5%)\t . . .$ " + taxAmount);
		System.out.println("Shipment\t . . .$ " + shipment);
		System.out.println("Discount\t . . .$ " + discount);
		System.out.println("******************************************");
		System.out.println("Grand total is: \t . . .$"+grandTotal);
		
				
		
		
		
	}

}
