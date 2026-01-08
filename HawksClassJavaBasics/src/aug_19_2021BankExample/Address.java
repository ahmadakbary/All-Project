package aug_19_2021BankExample;
public class Address {
	
	//information needed for address is
	String addLineOne;
	String addLineTwo;
	String city;
	String state;
	String zipCode;
	
	//default constructor-for the times that we do not have address info and still need to create an objects of the class
	public Address() {
		addLineOne = "";
		addLineTwo = "";
		city = "";
		state = "";
		zipCode = "";	
	}	
// we need one parameterized constructor that will take all o the address info and assign it to the variable in the obj.
	public Address(String addL1, String addL2, String c, String s, String z) {
		addLineOne = addL1;
		addLineTwo = addL2;
		city = c;
		state = s;
		zipCode = z;
		}		
// this is the toString method-the definition of the method should match this exactly
		public String toString() {
			return "Address: "+addLineOne+" "+addLineTwo+", "+city+", "+state+", "+zipCode;
		
		}
//this method will be used to compare the object of this class to another instance of this class
		public boolean equals(Address newAddress) {
		// a.line1  - b.line2
		// a.city   - b.line2
		// a.state  - b.state
		// a.zipcod - b.zipcode
			
	if (addLineOne.equals(newAddress.addLineTwo)) {//if line 1 is equal then check
		if (addLineTwo.equals(newAddress.addLineTwo)) {//if line 2 is equal then check
			if (city.equals(newAddress.city)) {// if city is equal then check
				if(state.equals(newAddress.state)) {//if state is equal
					if(zipCode.equals(newAddress.zipCode)) {// if zipcode is equal then the address is the same.
						//if the variables between the two objects are the same then return true
						return true;
							
						}
					}
				}
			}		
		}
// of any of the condition fail,  then we get out and return false
			return false;
		
			
			
			
			
		
		}
}

