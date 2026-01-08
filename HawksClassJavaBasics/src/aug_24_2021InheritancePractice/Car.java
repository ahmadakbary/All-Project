package aug_24_2021InheritancePractice;
public class Car {

	private String color;
	private String model;
	private String make;
	private int years;
	private int numberOfDoors;
	private double price;
	private String vinNumber;
		
		
//default Constructor
	public Car() {
		super();
		this.color ="";
		this.model = "";
		this.make = "";
		this.years = 0;
		this.numberOfDoors = 0;
		this.price = 0;
		this.vinNumber = "";
		}	
//Parameterized Constructor for vin, make and model
	public Car(String vinNumber, String make, String model) {
		this();
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
		}
//Parameterized Constructor
public Car(String color, String model, String make, int years, int numberOfDoors, double price, String vinNumber) {
		this(vinNumber, make, model);
		this.color = color;
		this.years = years;
		this.numberOfDoors = numberOfDoors;
		this.price = price;
		
}
	public String getColor() { //getter
		return color;
		}
	public void setColor(String color) { //setter
		this.color = color;
		}
	public String getModel() { //getter
		return model;
		}
	public void setModel(String model) { //setter
		this.model = model;
		}
	public String getMake() { //getter
		return make;
		}
	public void setMake(String make) { //setter
		this.make = make;
		}
	public int getYears() { //getter
		return years;
		}
	public void setYears(int years) { //setter
		this.years = years;
		}
	public int getNumberOfDoors() {//getter
		return numberOfDoors;
		}
	public void setNumberOfDoors(int numberOfDoors) { //setter
		this.numberOfDoors = numberOfDoors;
		}
	public double getPrice() { //getter
		return price;
		}
	public void setPrice(double price) { //setter
		this.price = price;
		}
	public String getVinNumber() { //getter
		return vinNumber;
		}
	public void setVinNumber(String vinNumber) { //setter
		this.vinNumber = vinNumber;
		
	
		
		
		}
	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", make=" + make + ", years=" + years + ", numberOfDoors="
				+ numberOfDoors + ", price=" + price + ", vinNumber=" + vinNumber + "]";
	}		
	}