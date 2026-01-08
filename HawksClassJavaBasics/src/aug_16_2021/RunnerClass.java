package aug_16_2021;
public class RunnerClass {
public static void main(String[] args) {
		
	Student st1 = new Student();
	Student st2 = new Student();
	Student st3 = new Student();
	System.out.println("------------------");	
	
	st1.name = "ahmad";
	st1.age = 35;
	st1.id = 12;
	st1.gender = 'M';
			
	st2.name="Shekaib";
	st2.age= 30;
	st2.id = 32;
	st2.gender = 'M';
			
	st3.name = "Omar Jan";
	st3.age = 8;
	st3.id = 1232;
	st3.gender = 'M';
	
	System.out.println("Name: "+ st1.name);
	System.out.println("Age: "+ st1.age);
	System.out.println("ID: "+ st1.id);
	System.out.println("Gender: "+ st1.gender);	
	System.out.println("-----------------");	
			
	System.out.println("Name: "+ st2.name);
	System.out.println("Age: "+ st2.age);
	System.out.println("ID: "+ st2.id);
	System.out.println("Gender: "+ st2.gender);		
	System.out.println("-----------------");
	
	System.out.println("Name: "+ st3.name);
	System.out.println("Age: "+ st3.age);
	System.out.println("ID: "+ st3.id);
	System.out.println("Gender: "+ st3.gender);
	

	}

}
