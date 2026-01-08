package Day10;
public class FinallyBlockException {
public static void main(String[] args) {	
System.out.println("program started..");

	int a []=new int [5];	
	try {
a[6]=100;
	}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Handled Exceptions..");	
System.out.println(e.getMessage());
	}
finally {
System.out.println("Entered into Finally Block..");
	}
	
}
}