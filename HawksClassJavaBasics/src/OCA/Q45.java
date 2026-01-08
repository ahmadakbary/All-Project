package OCA;

import java.security.cert.CertificateException;
import java.util.ArrayList;

public class Q45 {
public static void main(String[] args) {
	
	ArrayList myList = new ArrayList();
	
	String [] myArray;
	
	try { 
			while (true) {
				myList.add("My String");
				
			}
}

			catch(RuntimeException re) {
				System.out.println("Cought a RuntimeException");
			}
			catch(Exception e) {
				System.out.println("Coughtan Exception");
			}
			System.out.println("Ready to use");
	
}

}