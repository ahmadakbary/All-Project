package aug_17_2021;
public class Student {
	
	String name;
	int age;
	int id;
	char gender;
	
	public Student()	{
		name = "";
		age = 0 ;
		id = 0;
		gender = ' ';
		System.out.println("an oject is created");
}
	public Student(String newName, int newAge, int newId, char newGender) {
		name = newName;
		age = newAge;
		id = newId;
		gender = newGender;
		System.out.println("an oject is created");
}
	public Student (String newName) {
		name = newName;
		age = 0;
		id = 0;
		gender = 0;
		System.out.println("an oject is created");
	}

public void printinfo() {	
	String g = "";// varible for Genders
	if (gender =='M') {// we generated the if statement to generate the full gender
		g="Male";
	}else if (gender== 'F') {
		g= "Female";
	}else {
		g = "NA";	
	}
	System.out.println("Name: "+name+", Age: "+age+", ID: "+id+", Gender: " +g);
}

	public boolean equals(Student theOtherStudnet) {
		if (name.equals(theOtherStudnet.name)) {
			if (age == theOtherStudnet.age) {
				if (id == theOtherStudnet.id) {
				if (gender == theOtherStudnet.gender) {
					return true;
				}
			}
		}
	}	
		return false;
	}

}








