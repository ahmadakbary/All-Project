package JavaFullClass;
public class MethodOverloadingYouTube {
public static void main(String[] args) {
		
MethodOverloadingYouTube ahmad=new MethodOverloadingYouTube();
	ahmad.print(500);
	ahmad.print(6.50);
	ahmad.print("ahmad");
	ahmad.print(500, 600);
		}
public void print(int num) {
	System.out.println("1st print method");
	System.out.println("int: "+num);		
		}
public void print(double num) {		
	System.out.println("2nd print method");
	System.out.println("int: "+num);;
		}
public void print(String text) {	
	System.out.println("3rd print method");
	System.out.println("int: "+text);
		}
public void print(int num1, int num2) {	
	System.out.println("4th print method");
	System.out.println("int: "+num1+ "int:"+num2);
			}
		}
