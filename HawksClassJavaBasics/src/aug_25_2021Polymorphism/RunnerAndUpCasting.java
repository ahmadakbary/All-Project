package aug_25_2021Polymorphism;
public class RunnerAndUpCasting {
public static void main(String[] args) {
		
	A obj1 = new A("Jack", 25);
	B obj2 = new B(10, "David", 45);
	C obj3 = new C();
	obj3.setName("Mike");
	obj3.setAge(25);
		
	obj1.printinfo();
	obj2.printInfo();
	obj3.printInfo();
	
//up-casting is the idea of declaring and object 
//of the parent class and initializing any of the child class
	A obj4 = new B();
	A obj5 = new C();

	Object obj6 = new A();
	Object obj7 = new B();
	
	int [] nums =  new int [5];
	nums[0] = 50;
	
	Object [] variable = new Object[5];
	variable [0] = "test";
	variable [1] = 15;
	variable [2] = false;
	variable [3] = 15.89;
	variable [4] = new A();
	
	variable [4] = new A("david", 15);
	for (int i = 0; i < variable.length; i++) {
		System.out.println(variable[i]);			
	}
		A [] objOfA = new A [5];
		objOfA[0] = new A ();
		objOfA[1] = new A ();
		objOfA[2] = new A ();
		objOfA[3] = new A ();
		objOfA[4] = new A ();
	
	objOfA[0].setName("Ana");
	for (A a : objOfA) {
	System.out.println();
	
	C obj10 = new C();

	
	}
	}
	
}
