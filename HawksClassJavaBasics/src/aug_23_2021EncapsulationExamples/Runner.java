package aug_23_2021EncapsulationExamples;
public class Runner {
public static void main(String[] args) {
	
StudentGetter_And_Setter obj = new StudentGetter_And_Setter ();
	obj.getFirstName();
	obj.setFirstName("ahmad");
	obj.setLastName("shekaib");
	System.out.println(obj.getFirstName());
	System.out.println(obj.getLastName());
	
}
}
