package aug_05_2021;
public class ReverseTheString {
public static void main(String[] args) {
			
	 // Reverse the String
String texts="I love to be a SDET"; // this is the value
int a = texts.length()-1; // this when we get the length - 1 which will give us the last index
while (a>=0) {// run for as long as texts>=0 which is the  last index we want to get
System.out.println("123456 " +a+ texts.charAt(a--)); //print the char at that index then reduce texts by 1
	}

}
}