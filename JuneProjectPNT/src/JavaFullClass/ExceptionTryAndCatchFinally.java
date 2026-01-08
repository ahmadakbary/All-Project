package JavaFullClass;
public class ExceptionTryAndCatchFinally {
public static void main(String[] args) {
		
	try { // to check try & catch change the valune in line 8
		System.out.println("this is beginging");
	int i=60;
	int r=i/2;
	System.out.println(r);
		} catch (Exception e) {
	System.out.println("there error displays");
	System.out.println(e.getMessage());
	e.printStackTrace();
		} finally {
	System.out.println("final");
	}
	System.out.println("this is end");
}
}