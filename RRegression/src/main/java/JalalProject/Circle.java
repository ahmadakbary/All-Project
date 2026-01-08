package JalalProject;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double radius,area;
        Scanner input = new Scanner(System.in);
       
        System.out.println("whats the radius");
        radius = input.nextDouble();
        input.close();
        area = 3.14*radius*radius;
        System.out.println("the area is " + area);
        
		
		
		
		
	}

}
