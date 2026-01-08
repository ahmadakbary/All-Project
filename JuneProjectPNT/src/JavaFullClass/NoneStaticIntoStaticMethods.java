package JavaFullClass;
public class NoneStaticIntoStaticMethods {
public static void main(String[] args) {
		
		addition();
		NoneStaticIntoStaticMethods ahmad=new NoneStaticIntoStaticMethods();
		ahmad.subtraction();
	}
	public static void addition() {	
		int [] ahmad=new int [5];
		ahmad[0]=12;
		ahmad[1]=13;
		ahmad[2]=45;
		ahmad[3]=14;
		ahmad[4]=15;
		System.out.println(ahmad[4]);
		//for (int a=0; a<=ahmad.length; a++) {
		///	System.out.println(ahmad[a]);
	
			
	}
	public void subtraction() {
		
		String how= "how did you call non static into static methods";
		String answer= "I called non static into static method by createing the object of the methods";
		System.out.println(how);
		System.out.println(answer);
	}
}
