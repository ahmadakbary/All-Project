package aug_24_2021InheritancePractice;
public class Camry extends Toyota {

	
	String trim;
	public Camry() {
		super();
		this.trim = "";
	}	
		public Camry(String trim, boolean hasFiveStarSafety,String color, String model, int years, int numberOfDoors, double price, String vinNumber) {
			super(hasFiveStarSafety, color, model, years, numberOfDoors, price, vinNumber);
			this.trim = trim;
		
			
		
	}

}

