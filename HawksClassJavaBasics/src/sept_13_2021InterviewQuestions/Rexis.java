package sept_13_2021InterviewQuestions;
public class Rexis {
public static void main(String[] args) {

String s = "asdfsdfasdf23AS23422100DF@:CE45647#$EF(*&*&(*&@&#(*&";
	 //a-z => all lower case character
	// A-z => all Upper case character
	// 0-9 => all lower case character
System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));//this only print signs
System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));//this only print alphabets & number
System.out.println(s.replaceAll("[^a-z]", ""));//this print lower case
System.out.println(s.replaceAll("[^A-Z]", ""));//this print upper case
System.out.println(s.replaceAll("[^0-9]", ""));//this print 0-9

	}

}
