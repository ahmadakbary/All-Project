package aug_24_2021InheritancePractice;
public class BMW extends Toyota {
	
	
	boolean hasHUD;
	
	public BMW() {
		super();
		this.hasHUD = false;
		
	}
	public BMW(boolean hasHUD,String color, String model, String make, int years, int numberOfDoors, double price, String vinNumber) {
		super(hasHUD, color, model, years, numberOfDoors, price, vinNumber);
		this.hasHUD = hasHUD;
		
		
	}
	public String toString() {
		return super.toString()+ "/ HUD:" +hasHUD; 
		
	}

}
