package Day4;

public class StringMethod {
	
	public static void main(String[] args) {
		
		
		String s = "    welcome   ";
		String s1 = "Welcome to java";
		
		System.out.println(s.length());
		System.out.println("text is welcome  "+s);
		System.out.println(s.trim().length());
		
		
		s = "welcome";
		s = "Welcome ";
		System.out.println(s.equals(s));
		System.out.println(s.charAt(4));
		System.out.println(s.contains("Wel"));
		System.out.println(s.equals(s1));
		System.out.println(s1.replace('W', 'a'));
		System.out.println(s.replace('w', 't'));
		System.out.println(s1.substring(2,5));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		if (s.equals(s1)) {
			System.out.println("String Test is passed");
		}else {
			System.out.println("StringTest is failed");
		}
		
		
		
	}

}
