package aug_17_2021;
public class RunnerClassSDET {
public static void main(String[] args) {

	
	SDETclass hawks = new SDETclass(5);


	Student st1 = new Student("Jack");
	Student st2 = new Student("Ben");
	Student st3 = new Student("Ahmad");
	Student st4 = new Student("Ana");
	Student st5 = new Student("Roy");
	Student st6 = new Student("David");
	Student st7 = new Student("Jack");
	
	System.out.println(st1 == st2);
	System.out.println(st1 == st7);
	System.out.println(st1.equals(st7));
	System.out.println(st1.equals(st2));
	
//		
//		hawks.enroll(st1);
//		hawks.enroll(st2);
//		hawks.enroll(st3);
//		hawks.enroll(st4);
//		hawks.enroll(st5);
//		hawks.enroll(st6);
	
	
	hawks.printListOfStudent();
		
	
	
	
	
}

}
