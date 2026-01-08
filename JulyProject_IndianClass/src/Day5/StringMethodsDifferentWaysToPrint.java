package Day5;
public class StringMethodsDifferentWaysToPrint {
public static void main(String[] args) {
	
//Length () of chars in a string
		String s="welcome";
		System.out.println(s.length());

//Concat() Cancatenation/Joining of string
		String s1="welcome";
		String s2="to Selenium";

		System.out.println(s1+s2);
		System.out.println("welcome"+"to selenium");
		System.out.println(s1.concat(s2));
		System.out.println("welcome".concat("to selenium"));

//trim()-- removes the spaces right & left
		s1="    welcome     ";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.trim().length());

// trimAt() return a character based on the index we passed,index starts from 0
		s="welcome";
		s="WELCOME";
		System.out.println(s.charAt(2));

//contains():return either true or false and it check the String is existing or not.
		s="WELCOME";
		System.out.println(s.contains("WEL")); //True
		System.out.println(s.contains("wel")); //false
		System.out.println(s.contains("COM")); //True
		
//equals():check both of the strings are equal or not and it returns true or false 
		s1="selenium";
		s2="Selenium";
		String s3="Selenium";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
//EqualsIgnoreCase(): if spelling is written in small or capital letter this function still run it.
		s1="selenium";
		s2="Selenium";
		s3="Selenium";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
// replace(): replace single char or replace sequence chars (String)
		s="Welcome to Selenium Welcome to Selenium Welcome to Selenium";
		System.out.println(s.replace('o', 'X'));
		System.out.println(s.replace("Selenium","Java"));

//Substring Index
		s="welcome";
		System.out.println(s.substring(3,7));//come
		
		s="welcome to Java";
		System.out.println(s.substring(11,15));//java
		
//case conversion
		s="WELcome";
		System.out.println(s.toUpperCase());//WELCOME
		System.out.println(s.toLowerCase());//welcome
		
	
}

}
