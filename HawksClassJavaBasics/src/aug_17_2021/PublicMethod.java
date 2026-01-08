package aug_17_2021;
public class PublicMethod {

	String car = "Toyota Sienna";
	String carColor = "white";
	String VinNumber = "VIN33435344234";
	String tireSize = "R17-60";
	int model = 2021;
	int tirePressure = 35;
	
public void pringtInfo() {
System.out.println("Car: "+car+ ",Car color:"+carColor+ ",VIN Number:"+VinNumber+""
                          + ",Tire size:"+tireSize+ ",Model: "+model+ ",Tire pressure: "+tirePressure);
	}
	
	String name = "ahmad";
	int age = 34;
	int ID = 234;
	char gender = 'M';
	public void printInfo1() {
		
		String g = "";// varible for Genders
		if (gender =='M') {// we generated the if statement to generate the full gender
			g="Male";
		}else {
			g= "Female";
		}
		
		System.out.println("Name: "+name+", Age: "+age+", ID: "+ID+", Gender: " +g);
		
	}
	}

