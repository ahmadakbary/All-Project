package JavaFullClass;
public class ExceptionsTryAndCatch {
public static void main(String[] args) {
	
try { // to check try & catch change the valune in line 8
	System.out.println("this is beginging");
int i=60;
int r=i/0;
System.out.println(r);
	} catch (Exception e) {
System.out.println("there error displays");
System.out.println(e.getMessage());
e.printStackTrace();
	}
System.out.println("this is end");

	}

}
