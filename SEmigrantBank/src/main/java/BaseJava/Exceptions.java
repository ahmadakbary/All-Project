package BaseJava;
import AccessModifiers.ProtectedModifier;
import AccessModifiers.PublicModier;
public class Exceptions extends ProtectedModifier {
public static void main(String[] args) {
	
	PublicModier Public = new PublicModier();
	Public.PublicAccessModifier();
	
	ProtectedModifier prot = new ProtectedModifier();
	prot.subtractions();
	prot.addition();
		
	try {
		
	int a = 10;
	int b = 0;
	int c = a/b;
	System.out.println(c);
	
	
	} catch(ArithmeticException t) {
		System.out.println("this script has ArithmeticException");
	}
		System.out.println("This is the end of ");
	}

}
