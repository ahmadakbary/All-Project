package A_July_22_2021;
public class StringExamples {
	public static void main(String[] args) {


		//how to change the case letter for a String in Java:
		
		String strCar1 = "corollo";
		String strCarUperCase = strCar1.toUpperCase();
		String strCar2 = "COROLLA";
		System.out.println("Comparing Car is "+strCar1.contentEquals(strCar1));
		System.out.println("Comparing car is: "+strCar1.equalsIgnoreCase(strCar2));
		
		String truck1 = "benz";
		String truckBenz = truck1.toLowerCase();
		String truck2 = "BENZ";
		System.out.println("Comparing Benz: "+truckBenz.contentEquals(truck2));
		System.out.println("Comparing Benz: "+truck1.equalsIgnoreCase(truck2));
		
		// length();
		
		String length = "house";
		System.out.println("how many is the character of the house "+length.length());
		
		// charAt();
		String apartment = "I live in Aldi";
		System.out.println("Character at a specific index: "+apartment.charAt(4));
		
		
		//index();
		String  indexNumber= "I love automations";
		System.out.println("index shows the index values: "+indexNumber.indexOf('v'));
		
		

	}

}
