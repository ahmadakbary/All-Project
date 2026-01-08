package I_Q_Java;
public class I_Q_16FindTheSequenceOfDuplicateChar {
public static void main(String[] args) {
	
	char [] chars = {'c', 's', 'c', 's', 'r', 'g', 'a', 'a', 'd','g'};
	for (int i = 1; i<chars.length; i++) {
		if (chars[i] == chars[i-1]) {
System.out.println("Found: its " +chars[i]+ " char is duplicate in sequnce on index " +i+ " and " +(i-1));
System.out.println(chars[i]);
break;
		}
	}
	
	
	
	}

}
