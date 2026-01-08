package A_July_26_2021;

public class SelectionInterest {
public static void main(String[] args) {
	
	
	double total = 500;
	double interest = 0;
	
	if (total > 3500) {
	//for odd, interest = 5.5
	// for even, interest = 6.5
	
	} else if (total >= 900) {
		interest = total * 0.035;
		System.out.println("you total was "+total+ " which added with interest of 3.5% "+interest+" is going to be "+total+interest);
	}else if (total >= 500) {
		interest = total *0.015;
		System.out.println("you total was "+total+ " which added with interest of 1.5% "+interest+" is goign to be "+total+interest);
	}
}
}
