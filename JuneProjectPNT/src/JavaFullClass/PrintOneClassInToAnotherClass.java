package JavaFullClass;
public class PrintOneClassInToAnotherClass {
public static void main(String[] args) {
		
StaticMethhod ahmad=new StaticMethhod(); //This class is called from different class
Method ob=new Method();					 //this class is the second class called
	
	ob.addition();
	ahmad.CallStaticIntoStatic();
	}

}
