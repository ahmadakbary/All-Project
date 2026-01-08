package Day9;
public class RunnerClass implements InterFace1,Interface2 {
public static void main(String[] args) {
		
	RunnerClass abstractMethods = new RunnerClass();
		abstractMethods.method1(20, 45, 50);
		abstractMethods.method2(2, 4, 6);
		abstractMethods.method7("I hate grocessory shopt", "You");
		abstractMethods.method8("I love Shoping", "do you love shoping too");	

	}
	@Override
	public void method1(double a, int b, int c) {	
		double Double = a+b+c;
		System.out.println(Double);
		
	}
	@Override
	public void method2(double a, int b, int c) {
		double Double = a*b*c;
		System.out.println(Double);
		
		double grade = 60.60;
			if (grade >=80) {
				System.out.println("The student grade is A");
			}else {
				System.out.println("Studen is failed");
			}	
	}
	@Override
	public void method3(double a, int b, int c) {
					
	}
	@Override
	public void method4(double a, int b, int c) {
			
	}
	@Override
	public void method5(double a, int b, int c) {
			
	}
	@Override
	public void method6(String b, String c) {
		String a = "ahmad";
		String t = "ahmad";
		if (a==t) {
			System.out.println("a is equal to t");
		}else {
			System.out.println("a is not equal to t");
		}		
	}
	@Override
	public void method7(String b, String c) {

		String ShopingLits = "walmart";
			switch (ShopingLits) {
			case "walmart":
				System.out.println("oil");
				System.out.println("sal");
				System.out.println("rice");
				System.out.println("oil");
				System.out.println("water");
				System.out.println("gum");
				System.out.println("orange");
				System.out.println("somehtig");
				break;
	
		}		
		System.out.println("*****************");
	}
	@Override
	public void method8(String b, String c) {
	
	String ClothingList ="TjMax";
	switch (ClothingList) {
	case "TjMax":
		System.out.println("perfume");
		System.out.println("shoes");
	}		
	}
	@Override
	public void method9(String b, String c) {
			
	}
	@Override
	public void method10(String b, String c) {
		
		
	}
}
