package aug_17_2021;
public class SDETclass {

// to run this class you have to create one more class to name it student
//Create a list to store students
	Student[] listOfStudent;

	public SDETclass() {
		listOfStudent = new Student[50];
		
	}
	public SDETclass(int size) {
		listOfStudent = new Student[size];
		
		
	}	
		public boolean enroll(Student newStudent) {
			for (int i = 0; i < listOfStudent.length; i++) {
				if (listOfStudent[i] == null) {
					listOfStudent[i] = newStudent;
					System.out.println("Contratulation, you are added to the class!");
					return true;
			}
		}
		System.out.println("class is full and we could not add you!");
		return false;
	}

		
		public void printListOfStudent() {
			System.out.println("----------------------------");
			for (int i = 0; i < listOfStudent.length; i++) {
				if (listOfStudent[i] ==null) {
					break;
				}
				//System.out.println(listOfStudent[i].name);
				listOfStudent[i].printinfo();
			}
			
			
			System.out.println("----------------------------");
		}
		
		
		
		
		
}