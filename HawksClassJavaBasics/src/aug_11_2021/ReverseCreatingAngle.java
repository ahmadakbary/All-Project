package aug_11_2021;
public class ReverseCreatingAngle {
public static void main(String[] args) {
	
	for (int w =0; w<3; w++) { //this code help you print three times
		
for (int i=0; i<5; i++	) {//this is called outer Loop,in console line 1 empty bcos value of i is 0
	for (int j=0; j<i; j++) { //this is called Inner Loop just value of j to i
					
	System.out.print("* ");	
	}
	System.out.println();
					}		
for (int i=5; i>=0; i--) {
for (int j=0; j<i; j++) {
	System.out.print("* ");
	}
	System.out.println();

			}

		}
		}
}