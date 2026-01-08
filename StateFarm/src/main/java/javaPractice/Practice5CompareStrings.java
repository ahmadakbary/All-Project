package javaPractice;
public class Practice5CompareStrings{

		public static void main(String[] args) {
			
			String subject= "Java";
			String subject1 = "JAVA";
			System.out.println(subject + " " +subject1);
			System.out.println(subject =subject1);
			System.out.println("********************************************************");
			
			System.out.println("Do these varibales are equals? " +subject.contentEquals(subject1));
			System.out.println("Do these varibales are equals? " +subject.equalsIgnoreCase(subject1));
			System.out.println("********************************************************");
			
			String name = "java";
			String sub = "selenium";
			System.out.println(name.replace("java", sub));
			System.out.println("********************************************************");
			
			String a = "I love java";
			String b = "I love selenium";
			System.out.println(a.replace(a, b));
			
			
			String strCar = "school";
			String strCarUpperCase = strCar.toUpperCase(); 
			System.out.println("school is changed to capitl letters" +strCarUpperCase);
			System.out.println("********************************************************");
			
			
			String i = "I love Afghanistan";
			String o = i.toUpperCase();	
			System.out.println(o);
			String c = "I love Kabul Jan";
			System.out.println("Comparing two strings "+i.contentEquals(c));
			
			if (i.equalsIgnoreCase(c)) {
				System.out.println("Test is passed with country name");
			}else {
				System.out.println("Test is passed with city name");
			}
			
			
					}
}













