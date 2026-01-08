package aug_26_2021LabSession;

public class Student {


	private String firstName;
	private String lastName;
	private int age;
	
	public Student() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		
	}
	public Student (String firstName, String lastName, int age) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;

	}
			public boolean equals(Student obj) {
				
				if (obj == null) {
					return false;
				}
			 if (this.firstName.equals(obj.getFirstName())) {
					if (this.lastName.equals(obj.getlastName())) {
						if (this.age == obj.age) {
							return true;
						}
					}
				}
				return false;
			}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "First Name: " +firstName+"Last Name: " +lastName+" Age: "+age;
	}
}



