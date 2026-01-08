package aug_17_2021;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		st1.name = "Jack";
		st1.age = 18;
		st1.id = 1;
		st1.gender = 'M';
				
		st2.name="Ahmad";
		st2.age= 25;
		st2.id = 2;
		st2.gender = 'M';
				
		st3.name = "David";
		st3.age = 35;
		st3.id = 3;
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
		
		Student st4 = new Student ("ana", 19, 4, 'F');
		Student st5 = new Student ();
		Student st6 = new Student("Jack");

		
		System.out.println("------------------");
		System.out.println("Name: "+ st4.name);
		System.out.println("Age: "+ st4.age);
		System.out.println("ID: "+ st4.id);
		System.out.println("Gender: "+ st4.gender);
		
		System.out.println("------------------");
		System.out.println("Name: "+ st5.name);
		System.out.println("Age: "+ st5.age);
		System.out.println("ID: "+ st5.id);
		System.out.println("Gender: "+ st5.gender);
		
		st1.printinfo();
		st4.printinfo();
		
	}

}
