package aug_16_2021;
public class ConstructorWithArgument {
		
	String name;
	int age;
	int id;
	char gender;
//parameterized constructor with argument	
public ConstructorWithArgument(String newName, int newAge, int newID, char newGender) {
	System.out.println("Object is called from designed class");
	newName=name;
	newAge=age;
	newID=id;
	newGender=gender;
	

}
}