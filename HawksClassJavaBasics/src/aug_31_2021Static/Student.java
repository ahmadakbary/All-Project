package aug_31_2021Static;
public class Student {

    String name;
	static int count = 0;

	public Student () {
		name = "";
		count++;		
	}
	public Student (String name) {
		this();
		this.name = name;
	
		
	}
}
