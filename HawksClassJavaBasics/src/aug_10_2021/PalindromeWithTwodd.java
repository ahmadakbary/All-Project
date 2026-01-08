package aug_10_2021;
public class PalindromeWithTwodd {
public static void main(String[] args) {
	String word = "maddam";
	String reverse = "";
				
	for (int i = word.length()-1; i>=0; i--) {
		reverse = reverse+ word.charAt(i);
		}	
System.out.println("Word: "+word);
System.out.println("Reverse: "+reverse);
System.out.println(word.equals(reverse)? "It's Palindrome" : "It's not Palindrome");
					
	if (word.equals(reverse)) {
System.out.println("the word is Palindrome");
					
	}else {
System.out.println("the word is not Palindrome");
}
for (int forward = 0, backword = word.length()-1; forward<word.length(); forward++, backword--) {
if (forward == backword || forward > backword) { 
//if the length is Odd, the middle will be the same values
//if the length is even, we pass the middle of the work when forward is bigger than backword
//when we reach or pass the middle and everything is teh same so far, we can stop comparing it's palindrom and we can get out
System.out.println("Palindrome Without reverse stirng");
break;
}
if (word.charAt(forward)!= word.charAt(backword)) {
System.out.println("Not Palindrome");
break;
						
					}
				}
			}

		}
