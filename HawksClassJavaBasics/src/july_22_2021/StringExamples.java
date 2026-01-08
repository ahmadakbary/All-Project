package july_22_2021;
public class StringExamples {
	public static void main(String[] args) {
			
String firstName ="ahmad";
String lastName = "akbary";
System.out.println(firstName +" "+   lastName);
		
String str1 ="firstName";
String str2 = "lastName";
String str3 = "ahmad";
String str4 = "john";	
System.out.println("String 1 is " +str1);
	System.out.println("String 2 is " +str2);
	System.out.println("String 3 is " +str3);
	System.out.println("String 4 is " +str4);
	System.out.println(str2 +" and "+ str2 +" and "+ str3 +" and "+ str4 );
			
	//Compare with Strings
	String city = "Arlington";
	String address = "Arlington";
	System.out.println(city==address);
	String State = "virginia";
	String myState = "virginai";
	System.out.println(State==myState);		
	
//Compare with string methods
	String mystate = "virginia";
	String myCountyState = "virginia";
	System.out.println(mystate.contentEquals(myCountyState));		
		
String subject1 = "java";
String subject2 = "JAVA";
System.out.println(subject1.contentEquals(subject2)); // this method is case sensitive
System.out.println(subject1.equalsIgnoreCase(subject2)); // this method compares
	}

}













