package BaseJava;
public class ConstructorOverloading {
public static void main(String[] args) {
	ConstructorOverloading obj = new ConstructorOverloading("ahmad", "akbary", "SDET");
	
	SigleArrayWithInt array = new SigleArrayWithInt();	// this is a different class
	array.ArrayTypes(); // object of the class
	
	}
		public ConstructorOverloading() {		
		}
		public ConstructorOverloading(String Fname, String Lname, String job) {
			System.out.println("first Name is "+Fname + " last name is "+ Lname+ " job is "+job);
			
		}
	}

