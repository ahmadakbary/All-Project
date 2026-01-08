package JavaFullClass;

import AccessMofifiers.PrivateModifiers;

public class Method {
public static void main(String[] args) {
	addition();
		
	}
		public static void addition() {
	PrivateModifiers obj=new PrivateModifiers();
	obj.calldatahidding();
			int a=60;
			int b=40;
			int c=a+b;
			System.out.println(c);
			
			String Methods="how to print method inside method";
			String methods="you can create method inside but adding your method name under the method name";
			System.out.println(Methods);
			System.out.println(methods);
			
			
		
		}

	}

