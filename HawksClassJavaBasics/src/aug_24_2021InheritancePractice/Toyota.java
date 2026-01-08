package aug_24_2021InheritancePractice;
public class Toyota extends Car{
	
	boolean hasFiveStarSafety;
	
	public Toyota() {
		super();
		hasFiveStarSafety = false;
		super.setMake("Toyota");
	}
public Toyota(boolean hasFiveStarSafety,String color, String model, int years, int numberOfDoors, double price, String vinNumber) {
		super(color, model, "Toyota", years, numberOfDoors, price, vinNumber);
		this.hasFiveStarSafety = hasFiveStarSafety;
	}
public boolean getHasFiveStarSafety(boolean hasFiveStarSafety) { //getter
		return hasFiveStarSafety;		
	}
public void setHasFiveStarSafety() { //setter
		this.hasFiveStarSafety = hasFiveStarSafety;
	}	
public String toString () {
		return super.toString() +"/FiveStarSafety: "+hasFiveStarSafety; 
	}
}
