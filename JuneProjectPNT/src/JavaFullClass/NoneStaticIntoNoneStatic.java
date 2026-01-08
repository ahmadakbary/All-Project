package JavaFullClass;
public class NoneStaticIntoNoneStatic {
public static void main(String[] args) {

				NoneStaticIntoNoneStatic ahmad=new NoneStaticIntoNoneStatic();
				ahmad.NoneStatic();
				
addition();	
}
	public static void addition() {
			String Static="call me Static Method into Static Method";
			System.out.println(Static);
			
			String call="static into NoneStatic don't call the object of the method";
			System.out.println(call);
	}		
	public void NoneStatic() {
		
		addition();
			String NoneStatic="call me none Static into Static";
			System.out.println(NoneStatic);
		
			callnoneStaticInToNoneStatic();
		}
	public void callnoneStaticInToNoneStatic() {
		String call="call nonestatic into nonestatic. NO object needs to call";
		String called="called nonestatic into nonestatic, callnoneStaticInToNoneStatic()";
		System.out.println(call);
		System.out.println(called);

	}
}