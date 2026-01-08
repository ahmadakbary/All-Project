package A_Aug_05_2021;
public class ReadingFromIndexZero {
public static void main(String[] args) {
	
String texts = "I love automations";//this is the values
int a = texts.length()-1;//this when we get the length-1 which give us the last index
while (a>=0) {//run for as long as texts>=0 which is the last index we want to get
System.out.println("this is when " +a+" "+texts.charAt(a--));//print the char at that index then reduce texts by 1
	}
}
}
