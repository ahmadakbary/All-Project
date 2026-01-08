package A_APractice;

public class Practice4 {

	public static void main(String[] args) {
		
String b = "Welcome to ";	
String a = "Automation";
System.out.println(a);
System.out.println(a.length());
System.out.println(" "+a);

System.out.println(b+a);
System.out.println("welcome to" + " Automation");

System.out.println(b.concat(a));


b= "Ahmad";
b= "AHMAD";
System.out.println(b.trim());
System.out.println(b.trim().length());;
System.out.println(b.charAt(2));

System.out.println(a.equals(b));
System.out.println(b.equalsIgnoreCase(b));
System.out.println("__________________________________");

String c = "Kabul";
String d = "Kabul";
System.out.println(c.replace("Kabul","Kabul Jan Qand"));
System.out.println(c.substring(1,3));
System.out.println(b.toUpperCase())	;
System.out.println(b.toLowerCase());

if  (c.equals(d)) {
	System.out.println("Strings are eqauls" +c.trim());
}else {
	System.out.println("Strings are not equals");
}

	}
}
