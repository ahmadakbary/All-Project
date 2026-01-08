package July_22_21;
public class StringComparing {
public static void main(String[] args) {
		
		
		
	String strCar1 = "bmw";		
	String strCarUpercase = strCar1.toUpperCase();
	System.out.println(strCarUpercase);
		
	String strcar2 = "BMW";
	System.out.println(strcar2.toLowerCase());
	
	
	
	System.out.println("comparing: "+strCar1.equals(strcar2));
	
	System.out.println(strCar1.length());
	
	
	String address = "my house is in aldie";
	System.out.println(address.charAt(9));
	
	System.out.println(address.indexOf('u'));
	
	
	System.out.println(address.substring(2,9));
	
	
	
		
		
	}
	
	
	
}
