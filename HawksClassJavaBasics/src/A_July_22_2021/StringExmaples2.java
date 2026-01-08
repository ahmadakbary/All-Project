package A_July_22_2021;

public class StringExmaples2 {
	
	public static void main(String[] args) {
		
		String firstName = "Ahmad";
		String lastName = "Omar";	
		System.out.println(firstName +" "+ lastName);
		
		
		String str1 = "Jalal";
		String str2 = "hadeese";
		String str3 = "leah";
		String str4 = "jamal";
		
		System.out.println("String 1 is "+ str1);
		System.out.println("String 2 is "+ str2);
		System.out.println("String 3 is "+ str3);
		System.out.println("String 4 is "+ str4);
	System.out.println(str1+" and " +str2 +" and "+str3+" and "+str4);
	
	//Compare with String
	String city = "Arlington";
	String address = "Arlington";
	System.out.println(city==address);
	
	String state = "Arlington";
	String mystate = "Arlington";
	System.out.println(state==mystate);
	
	//Compare with String method
	String myState = "virginia";
	String mycountystate = "virginia";
	System.out.println(myState.contains(mycountystate));
	
	
	String sub1 = "java";
	String sub2 = "JAVA";
	System.out.println(sub1.equals(sub2));
	System.out.println(sub1.contentEquals(sub2));
	System.out.println(sub1.equalsIgnoreCase(sub2));
	
	
	
	}

}
