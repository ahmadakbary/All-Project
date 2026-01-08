package javaPractice;

public class Practice5Length {

	public static void main(String[] args) {
		
		
		String str1 = "book";
		String str2 = "BOOK";
		String str3 = str1.toUpperCase();
		System.out.println("Str1 values changed to capital letters..." +str3);
		System.out.println("*******************************************");
		
		String str4 = str2.toLowerCase();
		System.out.println("str2 values changed from capital to small letterd..."+str4);
		
		System.out.println("Camparing two strings.. "+str1.equalsIgnoreCase(str2));
		
		String st = "Townhouse";
		System.out.println("The length of the values is..."+st.length());
		System.out.println("Read just the h from st... "+st.charAt(4)); // chartAt reads all the strings and print it for you.
		System.out.println("**********************************************");
		
		String myName = "Ahmad Shekaib Akbary live in aldie";
		String checkSubS = myName.substring(6);
		System.out.println(checkSubS);
		String checkNo2SubString = myName.substring(6, 13);
		System.out.println(checkNo2SubString);
		
		System.out.println("read the index of the value from nyName  "+myName.indexOf('k'));
		
		
		
		
		
		
	}
	
}
