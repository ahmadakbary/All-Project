package aug_23_2021EncapsulationExamples;
public class StudentGetter_And_Setter {

	private String firstName;
	private String lastName;
	
	public StudentGetter_And_Setter() {
		firstName = "";
		lastName = "";
		
//getter for the firstname - make sure that you return data type match the variable
		}	
		public String getFirstName(){
			return firstName;
		}	
		public String getLastName()	{
			return lastName;
		}
//setter you don't return anything - void. but you have to get the new data in as your parameter
		public void setFirstName(String FirstName) {
			this.firstName = FirstName;				
		}
		public void setLastName	(String LastName)	{
			this.lastName = LastName;
		}
	}
	
	
	
	

