package sept_01_2021StringBuilder;
public class StringBuilderExamples {	
public static void main(String[] args) {
	
String str = "TEST";// 001 same object in heap
str = str +"END"; //different location 002 in heap
str = str.toLowerCase();
System.out.println(str);
		
		
		
		
		
	}
	
}
