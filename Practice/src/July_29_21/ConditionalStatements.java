package July_29_21;
public class ConditionalStatements {
public static void main(String[] args) {
	
	int c = 'a';
	int d = 'b';
	System.out.println(c>d);
	System.out.println((int)c);
	
	int t = 't';
	int s = 'e';
	System.out.println((int)t);
	System.out.println(s);
	
	
	int num1 = 10;
	int num2 = 20;
	
String x = num1 >num2 ? "num1 is more than num2":"num2 is less than num1";
	int y = num1 >num2 ? num1-- : num2++;
	System.out.println(y);
	
	double grade = 70;
	String g = "The student is ";
	g+=(grade>=60)? "passed": "failing";
	System.out.println(g);
	

	String StoreToShop = "Target";
	System.out.println("with if Statements");
	
	if (StoreToShop.equalsIgnoreCase("Target")) {
		System.out.println("hat");
		System.out.println("pen");
		System.out.println("pencel");
		
	}else if (StoreToShop.equalsIgnoreCase("BestBuy")) {
		System.out.println("apple");
		System.out.println("tc");
		
	}else if (StoreToShop.equalsIgnoreCase("TJmax")) {
		System.out.println("watch");
		System.out.println("camra");
		
	}else if (StoreToShop.equalsIgnoreCase("Walmart")) {	
		System.out.println("oil");
		System.out.println("water");
		System.out.println("beans");
		
		
System.out.println("****************************");		
			
		
	}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	