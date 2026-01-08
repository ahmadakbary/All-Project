package sept_16_2021InterviewQuestions;
import java.util.HashMap;
import java.util.Map;
public class CountCharsQuestion {
	public static void main(String[] args) {	
		String str = "this is a test String";
		System.out.println(CountChars(str));
	}
public static Map<Character, Integer> CountChars(String str){
	Map<Character, Integer> tempMap = new  HashMap<>();	
		for (char c: str.toCharArray()) {	
			if (tempMap.containsKey(c)){
				System.out.println(c+ "  char found in the map");
			}else {
				System.out.println(c+ "  Char was not in the map. Added ot the map!");
				tempMap.put(c, 0);
			}	
		}
		return tempMap;
	}
	
	
	
	
	
	
}
